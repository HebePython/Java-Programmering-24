package Java_playground.java_test.Uppgifter; //Skriv ett program som tar emot ett nummer från user och skriver ut i terminalen om det är positivt, negativt eller noll.
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uppgift3 {

    public static String evalNumber(double number) { //Evaluates & returns a string, positive/negative
        String numPosOrNeg = "";
        if (number > 0) {
            numPosOrNeg = "positive";  
        } else if (number < 0) {
            numPosOrNeg = "negative";
        } else if (number == 0) {
            numPosOrNeg = "0"; 
        } 
        return numPosOrNeg;
    }

    public static String evalNumberSize(double number) { //Evaluates & returns a string if small or big number
        String numSize = "";
        if (number > 1000000) {
            numSize = "big";
        } else if (number < 1) {
            numSize = "small";
        } 
        return numSize;
    }

    public static void printResults(String positiveOrNegative, String size) { //Evaluates strings and prints results
        if (size != "") {
            System.out.println("The number is " + positiveOrNegative+ ", and it is a " + size + " number.");
        } else {
            System.out.println("The number is " + positiveOrNegative +".");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double usrNum = 0.0;

        while (true) { // Catches exceptions for using periods in doubles/floats
            try {
                System.out.println("Please enter a number: ");
                usrNum = sc.nextDouble();
                break;                        
            } catch (InputMismatchException e) { 
                System.out.println("Invalid input, please input a valid number.");
                sc.next();
            }
        }
        sc.close();

        String numPosOrNeg = evalNumber(usrNum); //Calling methods
        String numSize = evalNumberSize(usrNum);

        printResults(numPosOrNeg, numSize);
       
    }

    
}
