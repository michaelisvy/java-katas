package com.achilles.tennis;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ScoreTest {

    @Test
    public void thirty() {
        Score score = new Score(0, 0, 2);
        assertThat(score.getPointsTennisFormat()).isEqualTo(PointValue.THIRTY);
    }

    @Test
    public void advantage() {
        Score score = new Score(0, 0, 4);
        assertThat(score.getPointsTennisFormat()).isEqualTo(PointValue.ADVANTAGE);
    }
}
