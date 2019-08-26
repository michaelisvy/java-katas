package com.achilles.tennis.formatter;

import com.achilles.tennis.Score;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public abstract class ScoreFormatter {

    public ScoreFormatter() {
        initialiseScores();
    }

    public static final String DEUCE = "deuce";
    Map<Integer, String> scores = new HashMap<>();

    abstract void initialiseScores();



    public String format(Score score1, Score score2) {
        if ((score1.getPointsValue() == score2.getPointsValue()) && (score1.getPointsValue() == 3))
            return DEUCE;
        else if (score1.getPointsValue() == score2.getPointsValue())
            return scores.get(score1.getPointsValue()) + " all";
        else
            return scores.get(score1.getPointsValue()) + " " + scores.get(score2.getPointsValue());
    }
}
