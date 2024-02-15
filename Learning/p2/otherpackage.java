package p2;

import p1.*;

class otherpackage{

    otherpackage(){

        p1.protection pro = new p1.protection();
        System.out.println("different package non-subclass");
        //System.out.println("n = "+pro.n);
        //System.out.println("n_pri ="+pro.n_pri);
        //System.out.println("n_pro"+pro.n_pro);
        System.out.println("n_pub="+pro.n_pub);
    }
}