package com.achilles.tennis;

import com.achilles.tennis.formatter.ScoreLongFormatter;
import com.achilles.tennis.formatter.ScoreShortFormatter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchTest {


        @Test
        public void test_15_all_long() {
            Score score1 = new Score(0,0,1);
            Score score2 = new Score(0,0,1);
            TennisMatch tennisMatch = new TennisMatch(score1, score2);
            tennisMatch.setScoreFormatter(new ScoreLongFormatter());
            assertThat(tennisMatch.getFormattedResult()).isEqualTo("fifteen all");
        }

    @Test
    public void test_15_all_short() {
        Score score1 = new Score(0,0,1);
        Score score2 = new Score(0,0,1);
        TennisMatch tennisMatch = new TennisMatch(score1, score2);
        tennisMatch.setScoreFormatter(new ScoreShortFormatter());
        assertThat(tennisMatch.getFormattedResult()).isEqualTo("15 all");
    }



}
