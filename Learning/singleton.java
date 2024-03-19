class singletondemo{

    //Early initialisation
    static singletondemo demo = new singletondemo();

    private singletondemo(){
    }

    public static singletondemo getObject(){
        return demo;
    }
}

class singletondemo2{

    //Lazy initialization
    static singletondemo2 demo = null;

    private singletondemo2(){
    }

    public static singletondemo2 getObject(){

        if( demo == null){
            demo = new singletondemo2();
        }

        return demo;
    }
}

public class singleton{
    public static void main(String[] args){

        //singletondemo s1 = new singletondemo(); //error
        singletondemo s2 = singletondemo.getObject();
        singletondemo s3 = singletondemo.getObject();

        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        singletondemo2 s4 = singletondemo2.getObject();
        singletondemo2 s5 = singletondemo2.getObject();

        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
    }
}