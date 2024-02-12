package p1;

class samepackage{

    samepackage(){
        protection pro = new protection();
        System.out.println("same package");
        System.out.println("n = "+pro.n);
        //System.out.println("n_pri ="+pro.n_pri);
        System.out.println("n_pro"+pro.n_pro);
        System.out.println("n_pub="+pro.n_pub);
    }
}