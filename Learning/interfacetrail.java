class interfacetrail{

    public static void main(String[] args){
        
        customer c1 = new customer();
        c1.balance();
        c1.credit();
        c1.printstatement();

        business b1 = new business();
        b1.printstatement();
        b1.balance();
        b1.credit();
    }
}

interface interfaceA{

    void credit();
    void balance();
}

interface interfaceB{

    void printstatement();
}

class account implements interfaceA, interfaceB{

    public void credit(){
        System.out.println("In credit");
    }

    public void balance(){
        System.out.println("In balance");
    }

    public void printstatement(){
        System.out.println("In print statement");
    }
}

class customer extends account implements interfaceA, interfaceB{

    public void credit(){
        super.credit();
    }

    public void balance(){
        super.balance();
    }

    public void printstatement(){
        super.printstatement();
    }
}

class business extends account implements interfaceB{
    
    public void printstatement(){
        super.printstatement();
    }
}