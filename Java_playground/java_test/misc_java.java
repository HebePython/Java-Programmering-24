package Java_playground.java_test;
import java.util.Random;

public class misc_java {

    static int randomMethod() {
        Random rand = new Random();
        int rndNum = rand.nextInt(6 - 1 + 1) + 1;
        return rndNum;
    }

    static void player(int playerPoints, String playerName, int playerDice ) {
        int points = 0;
        String playerNames = "";
        int diceValue = 0;

    }

    public static void main(String[] args) {
    
        int num_1 = randomMethod();
        System.out.println(num_1);



    }



}