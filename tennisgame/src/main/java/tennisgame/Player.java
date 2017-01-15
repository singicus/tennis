package tennisgame;

public class Player {
    public String myScore = "love";  
    public int myPoints = 0;
    public String myName;

    public Player(String playerName){
        this.myName = playerName;
    }

    public void winBall(){
       myPoints = myPoints + 1;
    }
}