import model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Godfather";
        myMovie.launchYear = 1970;
        myMovie.minutes = 300;


        System.out.println(myMovie); // Here it will print Movie@memoryAdress
        System.out.println(myMovie.name);
        System.out.println(myMovie.launchYear);

        myMovie.avalia(8);
        myMovie.avalia(7);
        myMovie.avalia(5);

        System.out.println(myMovie.getSumScore());
        System.out.println(myMovie.returnMid());
    }
}