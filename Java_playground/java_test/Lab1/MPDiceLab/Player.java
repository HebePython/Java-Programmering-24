package Java_playground.java_test.Lab1.MPDiceLab;
<<<<<<< HEAD

public class Player {
=======
import java.util.ArrayList;

public class Player {
    private String name;
    private int points = 0;
    private Die dice; // Die type, dice variable name.
    private static ArrayList<Player> players;

    Player(String name) { //constructor, takes only name.
        this.name = name;
    }

    public String getName() { // returns name of player when called.
        return name;
    }

    public int getPoint() { //getter points. returns current amount of points when called.
        return points;
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

    private static ArrayList<Player> getWinners(ArrayList<Player> players) {
        ArrayList<Player> winners = new ArrayList<>();
        int maxPoints = 0;
        for (Player player : players) {
            if (player.getPoint() > maxPoints) {
                maxPoints = player.getPoint();
            }
        }
        for (Player player : players) {
            if (player.getPoint() == maxPoints) {
                winners.add(player);
            }
        }
        return winners;
    }


    private static void takeTurn(ArrayList<Player> players) {
        for (Player player : players) {
            player.rollDice();
            int dieValue = player.getDieValue();
            System.out.println(player.getName() + " rolled a " + dieValue);
            if (dieValue == 1) {
                System.out.println(player.getName() + " lost their points!");
                player.points = 0;
            } else {
                player.points += dieValue;
            }
            System.out.println(player.getName() + " now has " + player.getPoint() + " points.");
        }
    }
>>>>>>> bcf4dbbed5a46e21b3c7da1752cf3920673a5aad
    
}
