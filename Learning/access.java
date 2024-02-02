class test{

    public static int p1 = 10;
    private static int p2 = 10;
    static int p3 = 10;
    protected static int p4 = 10;

    static void display(){
        System.out.println(" " + p1 + " " + p2 + " " + p3 + " " + p4);
    }
}

class access{

    public static void main(String args[]){
        test.display();
        System.out.println(" " + test.p1 +  " " + test.p3 + " " + test.p4);  
    }
}