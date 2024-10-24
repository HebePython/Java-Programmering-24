package Java_playground.java_test.Lab1.DiceLab;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxRounds, rounds = 0; // declare variables for max rounds and round counter.

        while (true) { // loop until user enters a valid number
            try {
                System.out.println("Hello, welcome to DiceGame\nHow many rounds would you like to play? "); // asks for # rounds and then stores in maxRounds variable.
                maxRounds = sc.nextInt();
                sc.nextLine(); //consumes next nextline, so it doesn't skip nextLine for Player player1 = new Player(sc.nextLine())
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }

        System.out.println("Enter your name: ");// Ask for player name, create new player object.

            Player player1 = new Player(sc.nextLine()); //creates player putting user input as name.
            player1.addDie(); //creates new dice object, 

        while (rounds < maxRounds) { 

            rounds++; //round started, add 1 to round counter.
            System.out.println("Please guess a number 1-6: ");
            int usrGuess = 0; // declare usrGuess before the inner while loop

            while (true) { // loop until user enters a valid number
                try {
                    usrGuess = sc.nextInt();// player guess = scanner object
                    if (usrGuess >= 1 && usrGuess <= 6) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 and 6.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    sc.nextLine();
                }
            }

            player1.rollDice(); // call roll dice method from player1 in player class.
            
            if (usrGuess == player1.getDieValue()) {// check if player usrGuess == dice.currentValue
                player1.increaseScore(); // if yes increaseScore method called.
                System.out.println("Hurray! You guessed correctly!\nYour current score is: " + player1.getPoint());
            } else {
                System.out.println("You guessed wrong!\nThe correct number was: " + player1.getDieValue());
            }
            
        }
        
        System.out.println("Game over, Thanks for playing " + player1.getName() + "\nYour final score was: " + player1.getPoint());
        sc.close();
    
    }
}