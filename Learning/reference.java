class test{

    int i;
    int j;

    test(int i, int j){
        this.i = i;
        this.j = j;
    }
}

class reference{

    static void change(test t){
        t.i++;
        t.j++;
    }

    public static void main(String args[]){
        test t1 = new test(10,20);
        change(t1);
        System.out.println(t1.i +" " +  t1.j);
    }
}