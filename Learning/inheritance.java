class base{

    int i;

    base(int i){
        this.i = i;
    }

    void display(){
        System.out.println("base class");
    }
}

class child extends base{
    
    int i;
    int j;

    child(int i, int j){

        super(i);
        this.i = i;
        this.j = j;
    }

    void print(){
        System.out.println("in child class");
    }

    int getValue(){
        return super.i;
    }
}

class subchild extends child{

    subchild(int i, int j){

        super(i,j);
    }

    protected void finalize(){
        System.out.println("Clean up.");
    }
}

class inheritance{

    public static void main(String args[]){

        base bobj = new base(10);
        bobj.display();
        System.out.println("i = "+bobj.i);
        child cobj = new child(20,20);
        cobj.display();
        cobj.print();
        System.out.println("i = "+cobj.i);
        System.out.println("i = "+cobj.getValue());


        subchild s1 = new subchild(20,20);
    }
}