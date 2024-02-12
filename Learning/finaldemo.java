class sample{

    final int x = 10;
    int y = 20;

    final void display(){
        //System.out.println(++x);
        System.out.println(++y);
    }
}

class sample1 extends sample{

/*
    void display(){
        System.out.println("Hello");
    }
*/
}

class finaldemo{

    public static void main(String args[]){

        sample s1 = new sample();
        s1.display();
    }
}

final class sample2{

}

/*
class sample3 extends sample2{
    
}
*/