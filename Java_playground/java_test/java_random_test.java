package Java_playground.java_test;
import java.util.Scanner;
import java.lang.Math;

public class java_random_test {

    static int randomMethod() {
        int x = (int)(Math.random() *6) + 1;
        return x;    
    }

    static String playerNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userName = sc.nextLine();
        return userName;
    }
    public static void main(String[] args) {

        int player1Points = 0;
        int Player2Points = 0;
        

        while (true) {
            
            int player1Dice = randomMethod();
            int player2Dice = randomMethod();

            System.out.println("The current score is\n Player 1: " + player1Points + "\n Player 2: " + Player2Points);
            Scanner usrInput = new Scanner(System.in);
            System.out.println("Would you like to roll the dice? y or n: ");
            String yesOrNo = usrInput.nextLine();
            if (yesOrNo.equals("y")) {
                System.out.println("Player 1 rolls the dice and gets a " + player1Dice + "\nPlayer 2 rolls the dice and gets a  " + player2Dice);
            } else {
                System.out.println("Thank you for playing, good bye..");
                System.exit(0);
            }
            if (player1Dice > player2Dice) {
                player1Points += 1;
                System.out.println("Player 1 wins and gets 1 point!");
            } else if (player1Dice < player2Dice) {
                Player2Points += 1;
                System.out.println("Player 2 wins and get 1 point!");
            } else {
                System.out.println("It's a tie! No points are awarded");
            }
            if (player1Points == 5) {
                System.out.println("Player 1 wins! Good game!");
                break;
            } else if (Player2Points == 5) {
                System.out.println("Player 2 wins! Good game!");
                break;
            } else; {
                continue;
            }
        }
    }        

}