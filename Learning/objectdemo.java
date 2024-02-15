class sample{

    int a;
    int b;

    sample(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return "a = "+a+" b = "+b;
    }

    public boolean equals(Object obj){

        sample other = (sample)obj;
        if((this.a == other.a) && (this.b == other.b)){
            return true;
        }
        else{
            return false;
        }
    }

    public Object clone(){

        sample s1 = new sample(this.a, this.b);
        return s1;
    }
}

class objectdemo{

    public static void main(String args[]){

        sample s1 = new sample(0, 0);
        System.out.println(s1);
        System.out.println(s1.hashCode());

        sample s2 = new sample(0,0);
        System.out.println(s2);
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));

        sample s3 = (sample)s1.clone();
        System.out.println(s1.equals(s3));
    }
}