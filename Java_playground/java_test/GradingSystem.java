package Java_playground.java_test;
import java.util.Scanner;

public class GradingSystem {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char actualGrade = 'C';
        char grade = 'X';
       while (actualGrade != grade) {
        System.out.print("Enter your grade (A, B, C, D, or F): ");
       grade = scanner.next().charAt(0);
       if (grade != actualGrade) {System.out.println("Invalid grade, please try again.");}
       }

       // Task 1: Check if grade actually matches the input.
       // Task: Convert the if/else into a switch case structure.
       switch (grade){
        case 'A': System.out.println("Excellent! You scored above 90."); break;
        case 'B': System.out.println("Well done! You scored between 80 and 90."); break;
        case 'C': System.out.println("Good effort! You scored between 70 and 80."); break;
        case 'D': System.out.println("You passed, but consider improving. You scored between 60 and 70."); break;
        case 'F': System.out.println("Unfortunately, you failed. You scored below 60."); break;
       }

       scanner.close();
   }
}
// End of code