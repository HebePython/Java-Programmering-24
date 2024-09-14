package Java_playground.java_test.SwitchCases;
import java.util.Scanner;

public class MenuSelection {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Choose an option:");
       System.out.println("1. Start");
       System.out.println("2. Settings");
       System.out.println("3. Exit");
       
       int choice = scanner.nextInt();
       
       switch (choice) {
        case 1: System.out.println("Game start!"); break;
        case 2: System.out.println("Video, Sound, Controls"); break;
        case 3: System.out.println("Thank you for playing!"); break;
          // To do: Implement a switch case which displays a message depending on user input
       }
       
       scanner.close();
   }
}
// For clarity, this comment is here to show that the MenuSelection code ends here