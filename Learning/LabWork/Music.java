import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class MusicTrack implements Serializable{

    private String title;
    private String artist;
    private String album;
    private int duration;

    public MusicTrack(String title, String artist, String album, int duration){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public int getDuration(){
        return this.duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    @Override
    public String toString(){
        return "Title: " + title + "," + " Artist: " + artist + "," + " Album: " + album + "," + " Duration: " + duration + " seconds. ";
    }
}

class MusicLibraryManager{

    private List<MusicTrack> musicTracks;
    private final String filepath;

    public MusicLibraryManager(String filepath){
        this.filepath = filepath;
        this.musicTracks = new ArrayList<>();
    }

    public void addTrack(MusicTrack track){
        musicTracks.add(track);
    }

    public void removeTrack(MusicTrack track){
        musicTracks.remove(track);
    }

    public void updateTrack(int index, MusicTrack track){

        if(index >= 0 && index< musicTracks.size()){
            musicTracks.set(index,track);
        }
        else{
            System.out.println("Invalid track index.");
        }
    }

    public void displayTracks(){
        System.out.println("Music Tracks: ");
        for(MusicTrack track: musicTracks){
            System.out.println(track);
        }
    }

    public void saveLibrary(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))){
            oos.writeObject(musicTracks);
            System.out.println("Music library serialized successfully.\n\n");
        }
        catch(Exception e){
            System.out.println("Error saving library: " + e.getMessage());
        }
    }

    public void loadLibrary(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))){
            musicTracks = (List<MusicTrack>)ois.readObject();
            System.out.println("Music library deserialized successfully.\n\n");
        }
        catch(Exception e){
            System.out.println("Error loading library: " + e.getMessage());
        }
    }
}

public class Music {
    public static void main(String[] args) {
        
        String filepath = "Serialize.ser";

        MusicLibraryManager library = new MusicLibraryManager(filepath);

        library.addTrack(new MusicTrack("Future", "Duratti", "Fields", 314));
        library.addTrack(new MusicTrack("Chamber", "DeMarco", "Salad", 231));

        library.displayTracks();
        library.saveLibrary();

        library.loadLibrary();
        System.out.println("Deserialized tracks: \n");
        library.displayTracks();
    }
}
