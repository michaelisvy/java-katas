package com.achilles.tennis;

public class TennisMatch {

    private Score score1;
    private Score score2;

    public TennisMatch() {
        this.score1 = new Score();
        this.score2 = new Score();
    }

    public TennisMatch(Score score1, Score score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public void addScore1() {
        ScoreOperations.addPoint(this.score1, this.score2);
    }

    public void addScore2() {
        ScoreOperations.addPoint(this.score2, this.score1);
    }



    public Score[] getResult() {
        return new Score[]{this.score1, this.score2};
    }


}
