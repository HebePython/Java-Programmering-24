package Java_playground.java_test;
import java.text.MessageFormat;

public class Exervise2Challenge {


    public static void main(String[] args) {
    
 /* C2.1a Nested loops
    a) - multiplication table 1-10.
    for (int i = 1; i <= 10; i++) {
        System.out.println("Multiple of: " + i); // Executes 2 times
        
        // Inner loop
        for (int j = 1; j <= 10; j++) {
          System.out.println(i * j); // Executes 6 times (2 * 3)
        }
      } 
        */
//  C2.1b    
    int rows = 5, k = 1;
    for (int i = 1; i <= rows; ++i) {
        for (int j = 1; j <= rows - i; ++j) { //prints space
            System.out.print(" ");                  
        }  
        for (k = 1; k <= i; ++k) { // prints variable k up until equals to i
            System.out.print(k);    
        } 
        for (k = i - 1; k >= 1; --k) { // sets k = i - 1. first loop k = 0 so k>=1 is false. no print
            System.out.print(k);      //  2nd loop. k = 2 - 1 = 1. prints 'k' as 1. --k so k = 0, exit loop
        }                             //  3rd k = 3 - 1. prints 'k' as 2, sets k as 1. prints k as 1. exit.
        System.out.println();
        } 
        
        
    }
}
