package com.achilles.tennis.formatter;

public class ScoreLongFormatter extends ScoreFormatter {


    @Override
    void initialiseScores() {
        this.scores.put(0, "love");
        this.scores.put(1, "fifteen");
        this.scores.put(2, "thirty");
        this.scores.put(3, "forty");
    }
}
