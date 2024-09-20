package Java_playground.java_test.Lab1;
import java.util.Random;

public class Die {
    int currentValue;
    int maxValue;

    Die(int maxValue) { // constructor.
        this.maxValue = getMaxDie();
    }

    public void roll() { // set current value to int 1-maxValue.
        Random rand = new Random();
        this.currentValue = rand.nextInt(this.maxValue - 1) + 1;
    }

    public int getMaxDie() { //getter
        return maxValue;
    }

    public void setDie() { //setter

    }


}

class Player {
    String name;
    int points;
    Die dice;

    public int getPoint() { //getter points
        return points;
    }

    public void setPoint(int points) { //setter points
        this.points = points;
    }

    public void rollDice() { //roll dice,

    }

    public int getDieValue(){ //returns value of dice roll
        return 4; //<--diceValue
    }

    public void increaseScore() {
        this.points++;
    }

    public void addDie() { //creates new die, adds to player.

    }
}

class DiceGame {

    public static void main(String[] args) {
        // TO DO
        // import scanner, ask how many rounds to play.
        // Ask for player name, create new player object.

        //While loop with round > maxrounds?
        // player guess = scanner object
        // check if player guess == what the dice rolls.
        // if yes increaseScore method called.
        
    }
}