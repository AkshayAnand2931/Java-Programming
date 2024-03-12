import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;


class WordFrequencyCounter{

    private final String filename;
    private final int numthreads;
    private final Map<String,Integer> wordFrequency;

    public WordFrequencyCounter(String filename, int numthreads){
        this.filename = filename;
        this.numthreads = numthreads;
        this.wordFrequency = new ConcurrentHashMap<>();
    }

    public void countWords() throws IOException, InterruptedException{

        StringBuilder content = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
        }

        String[] chunks = content.toString().split("(?<=\\G.{"+ (content.length() / numthreads) + "})");

        ExecutorService executor = Executors.newFixedThreadPool(numthreads);

        for(String chunk: chunks){
            executor.submit(new WordFrequencyTask(chunk));
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        for(WordFrequencyTask task:  WordFrequencyTask.tasks.keySet()){
            for(Map.Entry<String,Integer> entry: task.getWordFrequency().entrySet()){
                String word = entry.getKey();
                int count = entry.getValue();
                wordFrequency.merge(word, count, Integer::sum);
            }
        }
    }

    public Map<String,Integer> getWordFrequency(){
        return wordFrequency;
    }
}

class WordFrequencyTask implements Runnable{

    private final String chunk;
    private final Map<String,Integer> wordFrequency;

    public static final Map<WordFrequencyTask,Boolean> tasks = new ConcurrentHashMap<>();

    public WordFrequencyTask(String chunk){
        this.chunk = chunk;
        this.wordFrequency = new HashMap<>();
    }

    @Override
    public void run(){
        
        String[] words = chunk.split("\\s+");
        for(String word: words){
            wordFrequency.put(word,wordFrequency.getOrDefault(word, 0) + 1);
        }
        tasks.put(this,true);
    }

    public Map<String,Integer> getWordFrequency(){
        return wordFrequency;
    }
}


public class Main {
    public static void main(String[] args){

        String filename = "input.txt";
        int numthreads = 4;

        WordFrequencyCounter counter = new WordFrequencyCounter(filename,numthreads);
        try{
            counter.countWords();
            Map<String,Integer> wordFrequency = counter.getWordFrequency();
            wordFrequency.forEach((word,count) -> System.out.println(word + ": " + count));
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
