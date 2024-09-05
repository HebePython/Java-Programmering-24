package Java_playground.java_test;
import java.text.MessageFormat;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Exercises1 {
    
    public static void main(String[] args) {
        //1.1 - 1.4
        String myFirstName = "Henrik";
        int myAge = 32;
        System.out.println(MessageFormat.format("My name is {0} and I am {1} years old.", myFirstName, myAge));

        boolean alive = true;

        //1.5
    //    int x = 256;
    //    byte y = 8;
        // x = y, funkar eftersom typecast. int är större så en byte kommer alltid
        // passa in i en int. Pga samma sak så fungerar dock inte y = x. 

        //1.6 check E1.md

        //1.7 

        Ship calypso = new Ship();

        System.out.println(calypso);
        Ship ssKaparen = calypso;
        System.out.println(ssKaparen);

        //1.8
        
    //   int u = 4, short i = 12; // De som deklareras måste ha samma typ
        // ett ',' är inte tillåtet där.
        int p = 4, o = 12;  // Valid declaration

        //1.9 

        


        //1.6 extra

        //1.10 extra

        int ten = 10, twenty = 20, thirty = 30;
        int average = ten + twenty + 30 / 3; 
        System.out.println(MessageFormat.format("The average is {0}", average));

        // 1.11 extra
        boolean isRaining = true, isCold = true;

        if (isRaining == true && isCold == true) {
            System.out.println("Stay inside");
        } else {
            System.out.println("You can go outside");
        }

        // 1.11c ternary operator: single line. 
        System.out.println((isRaining && isCold) ? "Stay inside" : "You can go outside");

        //1.12
        String firstName = "Henrik", lastName = "Bergman", fullName = firstName + " " + lastName;
        System.out.println(MessageFormat.format("Full name: {0}, Length: {1}", fullName, fullName.length()));

        //1.13
     //   int x = 15, y = 4, quotient = x / y, remainder = x % y;
        //1.13d
        int x = 15, y = 4, remainder = x % y;
        double quotient = x / (double)y;
        System.out.println(MessageFormat.format("Quotient: {0}, Remainder: {1}", quotient, remainder));

        //1.14
        int value = 15;
        if (value % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        String result = (value % 2 == 0) ? "Even" : "Odd", result2 = (value > 10) ? "\nGreather than 10" : ""; 
        System.out.println(result + result2);

        //1.15
        String sentence = "This is really a sentence";
        int index = sentence.indexOf("the");
        String newResult = (index != -1) ? "was found at index " + index : "was not found";
        System.out.println(MessageFormat.format("The word 'the' {0}", newResult));

        //1.16 CHALLENGING
        int a = 44, b = 32, c = 21, temp = a; a = b; b = c; c = temp;
        System.out.println(MessageFormat.format("a: {0}, b: {1}, c: {2}", a, b, c));
        
        //1.17 
        int n = 55;
        int max = (n * (n + 1)) / 2;
        System.out.println(max);

        //1.18
        String originalString = "This is my sentence";
        String[] words = originalString.split(" ");
        int wordCount = words.length;
        System.out.println(wordCount);

        String reversedString = "";
        for (int i = wordCount - 1; i >= 0; i--) {
            reversedString += words[i];
            if (i != 0) {
                reversedString += " ";
            }
        }
        System.out.println(reversedString);

        //1.19
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int usrNum = 0;
        while (true) {
            try{
                System.out.println("Enter a number: ");
                usrNum = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please input a valid number.");
                sc.next();               
            }            
        }
        int totalNum = 0;
        int i = 0;
        System.out.println("______");
        for (i = 0; i < usrNum; i++) {
            if (i >= 1) { 
         //       int newNum1 = i + 1, newNum2 = i * (-3), newNum3 = (newNum1 - newNum2) * 2;
         //       totalNum = newNum2 + newNum3 + rand.nextInt(n - -n + 1) + 1;
                i += 1;
                int newNum2 = i * (-3);
                int newNum3 = (i - newNum2) * 2;
                totalNum = newNum3 + newNum2 + rand.nextInt(-n, n);
                System.out.println(totalNum);
            }

    //        System.out.println(MessageFormat.format("{0}", i + 1));
        }
        if (totalNum < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

        //1.19e ???????????????????????????????????? 
    }   


}
