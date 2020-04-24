public class PlayerTable {
    public static void main(String[] args) {
     var playerScore = 50;
     var playerName = "abel";
     var highScorePosition = calculateHighScorePosition(playerScore);
     displayhighscorePosition(playerName,highScorePosition);



    }
    public static void displayhighscorePosition(String name,int highScoreTable){
        System.out.println(name+ " manage to get into position "+highScoreTable);
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000)
            return 1;

        else if((playerScore >500) &&(playerScore < 1000))
            return 2;

        else if ((playerScore >100) &&(playerScore < 500))
            return 3;

        else
            return 4;
    }
}
