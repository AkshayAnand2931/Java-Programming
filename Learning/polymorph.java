class polymorph{

    static double add(int a, double b){
        return a + b;
    }

    static double add(double a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    public static void main(String args[]){

        //int c = add(10,20); //Ambiguous
        //System.out.println(c);
    }
}