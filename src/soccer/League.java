package soccer;

public class League {

    public static void main(String[] args) {
        Player player1 = new Player();
        player1.playerName = "Ntando Fitshane";

        Player player2 = new Player();
        player2.playerName = "Unalo Ngozi";

        Player player3 = new Player();
        player3.playerName = "Beki Bona";

        Player player4 = new Player();
        player4.playerName = "Jame Vusi";

        Player[] thePlayers = {player1, player2, player3, player4};

        Team team1 = new Team();
        team1.teamName = "The Greens";

        team1.playerArray = thePlayers;

        Team team2 = new Team();
        team2.teamName = "The Reds";

        team2.playerArray = new Player[4];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Lunga Bee";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Aya Boza";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Vovo Luvo";

        team2.playerArray[3] = new Player();
        team2.playerArray[3].playerName = "Toto Vee";

//        for (Player thePlayer : team1.playerArray){
//            System.out.println(thePlayer.playerName);
//        }
//
//        for (Player thePlayer : team2.playerArray){
//            System.out.println(thePlayer.playerName);
//        }
        Game cureGame = new Game();
        cureGame.awayTeam = team1;
        cureGame.homeTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = cureGame.awayTeam.playerArray[2];
        goal1.theTeam = cureGame.awayTeam;
        goal1.theTime = 55;

        Goal[] theGoal = {goal1};
        cureGame.goals = theGoal;

        System.out.println("Goal scored after " + cureGame.goals[0].theTime
                + " mins by " + cureGame.goals[0].thePlayer.playerName +
                " of " + cureGame.goals[0].theTeam.teamName);
    }


}
