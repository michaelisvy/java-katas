package com.achilles.tennis;

import java.util.HashMap;
import java.util.Map;

public class ScoreFormatter {

    public ScoreFormatter() {
    }

    public static final String DEUCE = "deuce";
    private static Map<Integer, String> scores = new HashMap<>();

    static {
        scores.put(0, "love");
        scores.put(1, "fifteen");
        scores.put(2, "thirty");
        scores.put(3, "forty");
    }



    public String format(Score score1, Score score2) {
        if ((score1.getPointsValue() == score2.getPointsValue()) && (score1.getPointsValue() == 3))
            return DEUCE;
        else if (score1.getPointsValue() == score2.getPointsValue())
            return scores.get(score1.getPointsValue()) + " all";
        else
            return scores.get(score1.getPointsValue()) + " " + scores.get(score2.getPointsValue());
    }
}
