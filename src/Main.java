import calc.RecommendationFilter;
import model.Episode;
import model.Movie;
import model.TvShow;

import java.security.spec.ECPoint;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Godfather";
        myMovie.launchYear = 1970;
        myMovie.minutes = 300;

        TvShow tvShow = new TvShow();
        tvShow.name = "The Office U.S";
        tvShow.launchYear = 2010;
        tvShow.planIncluded = true;
        tvShow.minutes = 20;


        System.out.println(myMovie); // Here it will print Movie@memoryAdress
        System.out.println(myMovie.name);
        System.out.println(myMovie.launchYear);

        myMovie.avalia(8);
        myMovie.avalia(7);
        myMovie.avalia(5);

        System.out.println(myMovie.getSumScore());
        System.out.println(myMovie.returnMid());

        RecommendationFilter filter = new RecommendationFilter();

        Episode episode = new Episode();
        episode.setNumero(1);
        episode.setTvShow(tvShow);

        filter.filter(episode);
    }
}