package com.achilles.tennis;

public class Score {

    private int setsValue;
    private int gamesValue;
    private int pointsValue;

    public Score() {
    }

    public Score(int setsValue, int gamesValue, int pointsValue) {
        this.setsValue = setsValue;
        this.gamesValue = gamesValue;
        this.pointsValue = pointsValue;
    }

    public void addPoint() {
        this.pointsValue++;
    }

    public void addGame() {
        this.gamesValue++;
    }

    public int getGamesValue() {
        return gamesValue;
    }

    public void addSet() {
        this.setsValue++;
    }


    public int getPointsValue() {
        return pointsValue;
    }

    public void setPointsValue(int pointsValue) {
        this.pointsValue = pointsValue;
    }

    public void resetPoints() {
        this.pointsValue = 0;
    }

    public void resetGames() {
        this.gamesValue = 0;
    }

    @Override
    public String toString() {
        return "sets: " + setsValue + " games: " + gamesValue + " points: " + pointsValue;
    }

    @Override
    public boolean equals(Object obj) {
        Score dest = (Score) obj;
        if (this.setsValue == dest.setsValue && this.gamesValue == dest.gamesValue
                    && this.pointsValue == dest.pointsValue) {
            return true;
        } else {
            return false;
        }
    }
}
