package Java_playground.java_test.Lab1.DiceLab;

public class Player {
    private String name;
    private int points = 0;
    private Die dice; // Die type, dice variable name. 

    Player(String name) { //constructor, takes only name.
        this.name = name;
    }

    public String getName() { // returns name of player when called.
        return name;
    }

    public int getPoint() { //getter points. returns current amount of points when called.
        return points;
    }

    public void setPoint(int points) { //setter points ((IS THIS NEEDED?))
        this.points = points;
    }

    public void rollDice() { // rolls dice, dice is of Die type so it has .roll() method.
        dice.roll();
        System.out.println("You roll the dice!");
    }

    public int getDieValue(){ //returns value of dice roll
        return dice.getCurrentValue(); // get current value
    }

    public void increaseScore() { //increases player score when called.
        this.points++;
    }

    public void addDie() { //creates new die for player and adds max dice value.
        this.dice = new Die(6); 
    }
}
