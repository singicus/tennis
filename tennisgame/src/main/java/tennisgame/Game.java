package tennisgame;

import java.util.List;
import java.util.Arrays; 

public class Game {
    public Player player1; 
    public Player player2;

    List<String> scoreWords = Arrays.asList("love","fifteen","thirty","forty");

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore(){ 
        String theScore;
        String whoIsAhead;
        if  (player1.myPoints >= 3 && player2.myPoints >= 3 ) {
            int pointDifference = Math.abs(player1.myPoints - player2.myPoints);
            if (pointDifference == 0) {
                theScore = "deuce";
            } else {
            whoIsAhead = (player1.myPoints > player2.myPoints) ? player1.myName : player2.myName;
            theScore = (pointDifference == 1) ? "advantage " + whoIsAhead : whoIsAhead + " won";
            }
         } else {
         theScore = scoreWords.get(player1.myPoints)+ ", " + scoreWords.get(player2.myPoints);
        }  
      return theScore;
    }
}
    
    
   

  

   