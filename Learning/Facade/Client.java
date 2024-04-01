package Facade;

public class Client{

    public static void main(String[] args) {

        System.out.println("Starting client!!");
        MovieFacade facade = new MovieFacade();
        facade.playMovie("Forrest Gump");
        facade.stopMovie();
    }
}
