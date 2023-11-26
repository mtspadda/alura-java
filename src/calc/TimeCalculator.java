package calc;

import model.Movie;
import model.Tittle;
import model.TvShow;

public class TimeCalculator {

    private int fullTime;

    public int getFullTime(){
        return fullTime;
    }

    public void include(Movie m){
        fullTime += m.getMinutes();
    }

    public void include(TvShow tvShow){
        fullTime += tvShow.getMinutes();
    }

    public void include(Tittle tittle){
        fullTime += tittle.getMinutes();
    }
}
