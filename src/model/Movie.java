package model;

import calc.Classification;

public class Movie extends Tittle implements Classification {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getClassification(){
        return 0;
    }

    @Override
    public int getClassificacao() {
        return (int) returnMid()/ 2 ;
    }
}
