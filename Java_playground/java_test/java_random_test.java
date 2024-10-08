package Java_playground.java_test;
import java.util.Scanner;

public class java_random_test {

    static int randomMethod() { //Dice roll generator, simulates 6-sided die.
        int x = (int)(Math.random() *6) + 1;
        return x;    
    }

    static String playerNames() { //Method to ask for player names
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userName = sc.nextLine();
        sc.close();
        return userName;
    }
    public static void main(String[] args) {

        int player1Points = 0;
        int Player2Points = 0;

        while (true) { //main gameplay loop
            
            int player1Dice = randomMethod();
            int player2Dice = randomMethod();
            String player1Name = playerNames();
            String player2Name = playerNames();

            System.out.println("The current score is\n" + player1Name + ": " + player1Points + "\n" + player2Name + ": " + Player2Points);

            Scanner usrInput = new Scanner(System.in); //Asks for user input whether to keep playing.
            System.out.println("Would you like to roll the dice? y or n: ");
            String yesOrNo = usrInput.nextLine();
            usrInput.close();

            if (yesOrNo.equals("y")) { //Checks user input. Option to exit loop.
                System.out.println(player1Name + "rolls the dice and gets a " + player1Dice + "\n" + player2Name + "rolls the dice and gets a  " + player2Dice);
            } else {
                System.out.println("Thank you for playing, good bye.."); //Exits program if user types anything but 'y'.
                System.exit(0);
            }

            if (player1Dice > player2Dice) { // checks who won dice roll and adds points
                player1Points += 1;
                System.out.println(player1Name + " wins and gets 1 point!");
            } else if (player1Dice < player2Dice) {
                Player2Points += 1;
                System.out.println(player2Name + " wins and get 1 point!");
            } else {
                System.out.println("It's a tie! No points are awarded");
            }

            if (player1Points == 5) { // checks for win condition
                System.out.println(player1Name + " wins it all! Good game!");
                break;
            } else if (Player2Points == 5) {
                System.out.println(player2Name + "wins it all! Good game!");
                break;
            } else; {
                continue; // Unnecessary?
            }
        }
    }        

}