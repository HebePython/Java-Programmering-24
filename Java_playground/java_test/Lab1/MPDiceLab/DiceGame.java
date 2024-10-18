package Java_playground.java_test.Lab1.MPDiceLab;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the dice game!");
        System.out.println("How many players are there?");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter the name of player " + (i + 1) + ":");
            String name = scanner.nextLine();
            Player player = new Player(name);
            player.addDie();
            Player.players.add(player);
        }
        System.out.println("Let's play!");
        while (true) {
            Player.takeTurn(Player.players);
            System.out.println("Would you like to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("no")) {
                break;
            }
        }
    }
    
}
