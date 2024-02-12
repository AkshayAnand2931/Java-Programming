interface intface1{

    int c = 100;

    void display();

    default void write(){
        System.out.println("implement");
    }
}

interface intface2{
    void display();
}

interface intface3 extends intface1, intface2{
    
}

class sample implements intface1,intface2{
    
    int i;
    void print(){
        System.out.println("Instance method");
    }

    public void display(){
        System.out.println("Overriding display()");
    }
}

class interfacedemo{

    public static void main(String args[]){

        sample s1 = new sample();
        s1.print();
        s1.display();

        intface1 ref = new sample();
        ref.write();
        //ref.print(); //Does not work
        ref.display();
    }
}