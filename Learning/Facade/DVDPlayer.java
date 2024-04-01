package Facade;

public class DVDPlayer{

    DVDPlayer(){

    }

    public void playMovie(String movieName){

        System.out.println("Playing movie: " + movieName);
    }

    public void stopMovie(){

        System.out.println("Stopping movie.");
    }
}
