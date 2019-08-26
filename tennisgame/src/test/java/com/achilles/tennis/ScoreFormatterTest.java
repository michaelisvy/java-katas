package com.achilles.tennis;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreFormatterTest {
    private ScoreFormatter scoreFormatter = new ScoreFormatter();

    @Test
    public void testDeuce() {
        Score score1 = new Score(0,0,3);
        Score score2 = new Score(0,0,3);
        assertThat(scoreFormatter.format(score1, score2)).isEqualTo("deuce");
    }

    @Test
    public void test_15_all() {
        Score score1 = new Score(0,0,1);
        Score score2 = new Score(0,0,1);
        assertThat(scoreFormatter.format(score1, score2)).isEqualTo("fifteen all");
    }

    @Test
    public void test_15_love() {
        Score score1 = new Score(0,0,1);
        Score score2 = new Score(0,0,0);
        assertThat(scoreFormatter.format(score1, score2)).isEqualTo("fifteen love");
    }
}
