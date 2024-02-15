package p2;

import p1.*;

class protection2 extends p1.protection{

    protection2(){

        System.out.println("different package subclass");
        //System.out.println("n = "+n);
        //System.out.println("n_pri ="+pro.n_pri);
        System.out.println("n_pro"+n_pro);
        System.out.println("n_pub="+n_pub);
    }
}