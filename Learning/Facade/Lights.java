package Facade;

public class Lights{

    private int state;

    Lights(){
        state = 0;
    }

    public void on(){
        state = 1;
        System.out.println("Lights are on.");
    }

    public void off(){
        state = 0;
        System.out.println("Lights are off.");
    }
}
