import java.util.Scanner;

public class abstractFactory {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of drink(Coffee, Tea, Soft Drink):");
        String type = scanner.nextLine().strip();
        System.out.println("Enter the name of the drink: ");
        String drink = scanner.nextLine().strip();
        System.out.println("\n\n\n");

        Dispenser dispenser = new Dispenser();
        Beverage beverage = dispenser.prepareDrink(type,drink);
        beverage.prepare();
        beverage.pour();
        beverage.dispense();
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

class Espresso implements Coffee{

    public void prepare(){
        System.out.println("Prepare Espresso.");
    }

    public void pour(){
        System.out.println("Pour Espresso.");
    }

    public void dispense(){
        System.out.println("Dispense Espresso.");
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
        if(type.equals("Espresso")){
            return new Espresso();
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

class Dispenser{

    private BeverageFactory beverageFactory;

    Dispenser(){
        beverageFactory = null;
    }

    public Beverage prepareDrink(String type, String drink){

        if(type.equals("Coffee")){
            beverageFactory = new CoffeeFactory();
        }
        else if(type.equals("Tea")){
            beverageFactory = new TeaFactory();
        }
        else if(type.equals("Soft Drink")){
            beverageFactory = new SoftDrinkFactory();
        }

        Beverage beverage = beverageFactory.getBeverage(drink);
        return beverage;
    }
}