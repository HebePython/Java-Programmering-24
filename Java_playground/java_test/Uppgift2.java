package Java_playground.java_test; //Ta emot 3 nummer från user och skriv ut vilket som är störst
import java.util.Scanner;

public class Uppgift2 { 

    static int[] getNumbers() { //Ask user for numbers and assign in array.

        int[] usrNumbers = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a number: ");
            usrNumbers[i] = sc.nextInt();
        } 
        sc.close();    

        return usrNumbers;
    }
    
    public static void main(String[] args) {

        int[] myNumbers = getNumbers();  //call on method
        int max = myNumbers[0]; //assign max first number
        for (int i = 0; i < myNumbers.length; i++) { // loop through array
            if (myNumbers[i] > max) { // compare current number vs new array number
                max = myNumbers[i]; //assign highest value
            }
        }

        System.out.println("The biggest number is: " + max);


    }
    
}
