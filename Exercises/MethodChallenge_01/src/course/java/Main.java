package course.java;

public class Main {

    public static void main(String[] args) {
        int HighScorePosition;
        String playerName = "Ligma";
        HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, HighScorePosition);
        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition(playerName, HighScorePosition);
        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(playerName, HighScorePosition);
        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition(playerName, HighScorePosition);



    }

    public static void displayHighScorePosition(String playerName, int HighScorePosition){
        System.out.printf(playerName + " You managed to get into position " + HighScorePosition + " on the highscore table.\n");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        }
        else if(playerScore > 500 && playerScore < 1000){
            return 2;
        }
        else if(playerScore > 100 && playerScore < 500){
            return 3;
        }
        return 4;
    }
}
