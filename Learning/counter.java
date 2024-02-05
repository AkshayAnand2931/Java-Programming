
class count{

    static int counter = 0;

    static void updateCounter(){
        counter++;
    }
}

class test{
    
    test(){
        count.updateCounter();
    }
}

class counter{

    public static void main(String args[]){
        test t1 = new test();
        test t2 = new test();
        System.out.println("No of objects created are: "+ count.counter);
    }
}