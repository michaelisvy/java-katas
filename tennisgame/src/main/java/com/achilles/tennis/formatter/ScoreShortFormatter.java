package com.achilles.tennis.formatter;

public class ScoreShortFormatter extends ScoreFormatter {


    @Override
    void initialiseScores() {
        this.scores.put(0, "0");
        this.scores.put(1, "15");
        this.scores.put(2, "30");
        this.scores.put(3, "40");
    }
}
