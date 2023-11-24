package model;

public class Tittle {

    public String name;
    public int launchYear;

    public boolean planIncluded;

    private double sumScore;

    private int rattings;

    public int minutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public double getSumScore() {
        return sumScore;
    }

    public void setSumScore(double sumScore) {
        this.sumScore = sumScore;
    }

    public int getRattings() {
        return rattings;
    }

    public void setRattings(int rattings) {
        this.rattings = rattings;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void avalia(double nota) {
        sumScore += nota;
        rattings++;
    }

    public double returnMid(){
        return sumScore/rattings;
    }
}


