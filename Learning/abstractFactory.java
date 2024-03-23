public class abstractFactory {
    
    public static void main(String[] args){

    }
}

interface Beverage{
    void prepare();
    void pour();
    void dispense();
}

interface Coffee extends Beverage{

}

interface Tea extends Beverage{

}

interface SoftDrink extends Beverage{

}

class Expresso implements Coffee{

    public void prepare(){
        System.out.println("Prepare Expresso.");
    }

    public void pour(){
        System.out.println("Pour Expresso.");
    }

    public void dispense(){
        System.out.println("Dispense Expresso.");
    }
}

class Latte implements Coffee{

    public void prepare(){
        System.out.println("Prepare Latte.");
    }

    public void pour(){
        System.out.println("Pour Latte.");
    }

    public void dispense(){
        System.out.println("Dispense Latte.");
    }
}

class GreenTea implements Tea{

    public void prepare(){
        System.out.println("Prepare GreenTea.");
    }

    public void pour(){
        System.out.println("Pour GreenTea.");
    }

    public void dispense(){
        System.out.println("Dispense GreenTea.");
    }
}

class BlackTea implements Tea{

    public void prepare(){
        System.out.println("Prepare BlackTea.");
    }

    public void pour(){
        System.out.println("Pour BlackTea.");
    }

    public void dispense(){
        System.out.println("Dispense BlackTea.");
    }
}

class Cola implements SoftDrink{

    public void prepare(){
        System.out.println("Prepare Cola.");
    }

    public void pour(){
        System.out.println("Pour Cola.");
    }

    public void dispense(){
        System.out.println("Dispense Cola.");
    }
}

class Lemonade implements SoftDrink{

    public void prepare(){
        System.out.println("Prepare Lemonade.");
    }

    public void pour(){
        System.out.println("Pour Lemonade.");
    }

    public void dispense(){
        System.out.println("Dispense Lemonade.");
    }
}


interface BeverageFactory{
    public Beverage getBeverage(String type);
}
class CoffeeFactory  implements BeverageFactory{
    @Override
    public Beverage getBeverage(String type){
        if(type.equals("Expresso")){
            return new Expresso();
        }
        else if(type.equals("Latte")){
            return new Latte();
        }
        else{
            return null;
        }
    }
}

class TeaFactory  implements BeverageFactory{
    @Override
    public Beverage getBeverage(String type){
        if(type.equals("Black Tea")){
            return new BlackTea();
        }
        else if(type.equals("Green Tea")){
            return new GreenTea();
        }
        else{
            return null;
        }
    }
}

class SoftDrinkFactory  implements BeverageFactory{
    @Override
    public Beverage getBeverage(String type){
        if(type.equals("Cola")){
            return new Cola();
        }
        else if(type.equals("Lemonade")){
            return new Lemonade();
        }
        else{
            return null;
        }
    }
}