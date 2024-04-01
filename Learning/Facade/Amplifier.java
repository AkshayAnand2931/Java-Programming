package Facade;

public class Amplifier{

    private int volume;
    private int state;

    Amplifier(){
        this.volume = 0;
        this.state = 0;
    }

    public void on(){
        state = 1;
        System.out.println("Amplifier is on.");
    }

    public void off(){
        state = 0;
        System.out.println("Amplifier is off.");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume is set to: " + volume);
    }
}
