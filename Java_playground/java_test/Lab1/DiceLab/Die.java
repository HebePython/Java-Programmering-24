package Java_playground.java_test.Lab1.DiceLab;
import java.util.Random;
import java.util.Scanner;

public class Die {
    int currentValue;
    int maxDiceValue;
    private Random rand = new Random();

    Die(int maxDiceValue) { // constructor.
        this.maxDiceValue = maxDiceValue;
    }

    public void roll() { // set current value to int 1-maxDiceValue.
        this.currentValue = rand.nextInt(this.maxDiceValue) + 1;
    }

    public int getMaxDie() { //getter
        return maxDiceValue;
    }
    public int getCurrentValue() {
        return currentValue;
    }

}

class Player {
    String name;
    int points = 0;
    Die dice;

    Player(String name) { //constructor
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getPoint() { //getter points
        return points;
    }

    public void setPoint(int points) { //setter points
        this.points = points;
    }

    public void rollDice() { //roll dice,
        dice.roll();
        System.out.println("You roll the dice and get: " + getDieValue());
    }

    public int getDieValue(){ //returns value of dice roll
        return dice.getCurrentValue(); //<--get current value, thru getter.
    }

    public void increaseScore() {
        this.points++;
    }

    public void addDie() { //creates new die
        this.dice = new Die(6);
    }
}

class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxRounds, rounds = 0;
        // TO DO
        // import scanner, ask how many rounds to play.
        System.out.println("Hello, welcome to DiceGame\nHow many rounds would you like to play? ");
        maxRounds = sc.nextInt();
        sc.nextLine(); //consumes next nextline, so we can accept

        // Ask for player name, create new player object.
        System.out.println("Enter your name: ");
        Player player1 = new Player(sc.nextLine());
        player1.addDie(); //creates new dice object, 

        while (rounds < maxRounds) { 
            rounds++; //round finished, add 1 to round counter.
            System.out.println("Please guess a number 1-6: ");
            int usrGuess = sc.nextInt();// player guess = scanner object

            player1.rollDice(); //future update, add a 2nd guess. and the program will tell you under or over.
            
            if (usrGuess == player1.getDieValue()) {// check if player usrGuess == dice.currentValue
                player1.increaseScore(); // if yes increaseScore method called.
                System.out.println("Hurray! You guessed correctly!\nYour current score is: " + player1.getPoint());
            } else {
                System.out.println("You guessed wrong!\nThe correct number was: " + player1.getDieValue());
            }
            
        }
        
        System.out.println("Game over, Thanks for playing " + player1.name + "\nYour score was: " + player1.getPoint());
        
        sc.close();
    }
}