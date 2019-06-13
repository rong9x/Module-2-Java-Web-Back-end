public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final int DEUCE = 4;
    static String message = "";

    public static String getScore(int player1Score, int player2Score) {
        int tempScore = 0;
        if (player1Score == player2Score) {
            draw(player1Score);
        } else if (player1Score >= DEUCE || player2Score >= DEUCE) {
            getWinner(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    message += "-";
                    tempScore = player2Score;
                }
                playerScore(tempScore);
            }
        }
        return message;
    }

    public static String playerScore(int tempScore) {
        switch (tempScore) {
            case LOVE:
                message += "Love";
                break;
            case FIFTEEN:
                message += "Fifteen";
                break;
            case THIRTY:
                message += "Thirty";
                break;
            case FORTY:
                message += "Forty";
                break;
        }
        return message;
    }

    //handle draw points
    public static String draw(int playerScore) {
        switch (playerScore) {
            case LOVE:
                message = "Love-All";
                break;
            case FIFTEEN:
                message = "Fifteen-All";
                break;
            case THIRTY:
                message = "Thirty-All";
                break;
            case FORTY:
                message = "Forty-All";
                break;
            default:
                message = "Deuce";
                break;
        }
        return message;
    }

    //find out the winner
    public static String getWinner(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            message = "Advantage player1";
        } else if (minusResult == -1) {
            message = "Advantage player2";
        } else if (minusResult >= 2) {
            message = "Win for player1";
        } else message = "Win for player2";
        return message;
    }
}