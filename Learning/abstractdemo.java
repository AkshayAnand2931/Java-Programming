abstract class demo{

    abstract void methoda();
    void methodb(){
        System.out.println("Concrete method");
    }

    void methodd(){
        System.out.println("Original method");
    }
}

class demochild extends demo{

    void methoda(){

        System.out.println("Overridden.");
    }

    void methodc(){
        System.out.println("Not in base class");
    }

    void methodd(){
        System.out.println("Overridden d.");
    }
}

class abstractdemo{

    public static void main(String args[]){
        
        demochild dc = new demochild();
        dc.methoda();
        dc.methodb();
        dc.methodc();
        dc.methodd();
        
        demo d = new demochild();
        d.methoda();
        d.methodb();
        //d.methodc(); //Won't work
        d.methodd();
    }
}