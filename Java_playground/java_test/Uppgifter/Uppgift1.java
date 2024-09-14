package Java_playground.java_test.Uppgifter; //Skriv ett program som tar emot ett nummer från user och skriver ut i terminalen om det är positivt, negativt eller noll.
import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int usrNum = sc.nextInt();
        sc.close();

        if (usrNum >= 1) {
            System.out.println("The number is positive.");   
        } else if (usrNum <= -1) {
            System.out.println("The number is negative.");   
        } else {
            System.out.println("The number is 0.");   
        }

    }

    
}
