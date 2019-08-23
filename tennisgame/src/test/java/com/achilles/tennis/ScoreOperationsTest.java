package com.achilles.tennis;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ScoreOperationsTest {

    @Test
    public void basicIncrements() {
        Score winner = new Score(0, 0, 0);
        Score loser = new Score(0, 0,0);
        ScoreOperations.addPoint(loser, winner);
        ScoreOperations.addPoint(winner, loser);
        ScoreOperations.addPoint(winner, loser);
        assertThat(winner).isEqualTo(new Score(0, 0,2));
        assertThat((loser)).isEqualTo(new Score(0, 0,1));
    }

    @Test
    public void winSimpleGame() {
        Score winner = new Score(0, 0, 3);
        Score loser = new Score(0, 0,0);
        ScoreOperations.addPoint(winner, loser);
        assertThat(winner).isEqualTo(new Score(0, 1,0));
        assertThat((loser)).isEqualTo(new Score(0, 0,0));
    }

    @Test
    public void deuceAfterAdvantage() {
        Score winner = new Score(0, 0, 3);
        Score loser = new Score(0, 0,4);
        ScoreOperations.addPoint(winner, loser); // deuce
        assertThat(winner).isEqualTo(new Score(0, 0,3));
        assertThat((loser)).isEqualTo(new Score(0, 0,3));
    }

    @Test
    public void winGameAfterDeuce() {
        Score winner = new Score(0, 0, 3);
        Score loser = new Score(0, 0,3);
        ScoreOperations.addPoint(winner, loser);
        ScoreOperations.addPoint(winner, loser);
        assertThat(winner).isEqualTo(new Score(0, 1,0));
        assertThat((loser)).isEqualTo(new Score(0, 0,0));
    }

    @Test
    public void winSimpleSet() {
        Score winner = new Score(0, 5, 3);
        Score loser = new Score(0, 0,0);
        ScoreOperations.addPoint(winner, loser);
        assertThat(winner).isEqualTo(new Score(1, 0,0));
        assertThat(loser).isEqualTo(new Score(0, 0,0));
    }

    @Test
    public void winSet6_5() {
        Score winner = new Score(0, 5, 3);
        Score loser = new Score(0, 5,0);
        ScoreOperations.addPoint(winner, loser);
        assertThat(winner).isEqualTo(new Score(0, 6,0));
        assertThat(loser).isEqualTo(new Score(0, 5,0));
    }

    @Test
    public void winSet7_5() {
        Score winner = new Score(0, 6, 3);
        Score loser = new Score(0, 5,0);
        ScoreOperations.addPoint(winner, loser);
        assertThat(winner).isEqualTo(new Score(1, 0,0));
        assertThat(loser).isEqualTo(new Score(0, 0,0));
    }


}
