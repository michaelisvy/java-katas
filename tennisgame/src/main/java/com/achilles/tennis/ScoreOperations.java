package com.achilles.tennis;

public class ScoreOperations {

    public static final int FORTY = 3;
    public static final int ADVANTAGE = 4;

    public static void addPoint(Score winner, Score loser) {
        if(winnerIsOnePointFromWinningGame(winner, loser)) { // FORTY and no deuce
            incrementGameAndSet(winner, loser);
        } else if (advantage(loser)) {
            deuce(winner, loser);
        } else
            winner.addPoint();
    }

    private static void incrementGameAndSet(Score winner, Score loser) {
        if(winnerOneGameFromWinningSet(winner, loser)) {
            finishSet(winner, loser);
        } else {
            finishGame(winner, loser);
        }
    }

    private static void finishGame(Score winner, Score loser) {
        winner.addGame();
        winner.resetPoints();
        loser.resetPoints();
    }

    private static void finishSet(Score winner, Score loser) {
        winner.addSet();
        winner.resetGames();
        loser.resetGames();
        winner.resetPoints();
        loser.resetPoints();
    }

    private static boolean winnerIsOnePointFromWinningGame(Score winner, Score loser) {
        if (winnerIsLeadingGame(winner, loser) && fortyOrAdvantage(winner)) {
            return true;
        }
        else return false;
    }

    private static boolean advantage(Score score) {
        return (score.getPointsValue() == ADVANTAGE);
    }

    private static void deuce(Score score1, Score score2) {
        score1.setPointsValue(FORTY);
        score2.setPointsValue(FORTY);
    }

    private static boolean fortyOrAdvantage(Score score) {
        if ((score.getPointsValue() == FORTY) || (score.getPointsValue() == ADVANTAGE)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean winnerIsLeadingGame(Score winner, Score loser) {
        return winner.getPointsValue() > loser.getPointsValue();
    }

    private static boolean winnerOneGameFromWinningSet(Score winner, Score loser) {
        boolean isLeading = (winner.getGamesValue() > loser.getGamesValue());
        boolean lastGame = (winner.getGamesValue() ==5) || (winner.getGamesValue() ==6);
        return isLeading && lastGame;
    }




}
