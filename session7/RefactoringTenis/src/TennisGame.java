public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FOURTY = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FOURTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            findTheWiner(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case LOVE:
                        score += "Love";
                        break;
                    case FIFTEEN:
                        score += "Fifteen";
                        break;
                    case THIRTY:
                        score += "Thirty";
                        break;
                    case FOURTY:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static String findTheWiner(int player1Score, int player2Score) {
        String score = "";
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else score = "Win for player2";
        return score;
    }
}
