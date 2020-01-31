package com.achilles.tennis;

import com.achilles.tennis.formatter.ScoreFormatter;

public class TennisMatch {

    private Score score1;
    private Score score2;

    private ScoreFormatter scoreFormatter;


    public TennisMatch(Score score1, Score score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public void setScoreFormatter(ScoreFormatter scoreFormatter) {
        this.scoreFormatter = scoreFormatter;
    }

    public String getFormattedResult() {
        return this.scoreFormatter.format(this.score1, this.score2);
    }


}
