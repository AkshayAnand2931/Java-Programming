package Facade;

public class MovieFacade{

    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Lights lights;

    MovieFacade(){
        dvdPlayer = new DVDPlayer();
        amplifier = new Amplifier();
        lights = new Lights();
    }

    public void playMovie(String movie){

        lights.on();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.playMovie(movie);
    }

    public void stopMovie(){

        dvdPlayer.stopMovie();
        amplifier.off();
        lights.off();
    }
}
