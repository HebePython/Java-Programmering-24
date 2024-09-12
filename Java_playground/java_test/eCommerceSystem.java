package Java_playground.java_test;
import java.util.Scanner;
import java.text.MessageFormat;


public class eCommerceSystem {
    public static void main(String[] args) {

        int usrQuantity = 0;
        int usrCategory = 0;
        double payTotal = 0.0;
        boolean quit = false;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Choose what kind of item you want to purchase by typing corresponding number: ");
            System.out.println("\n1: Electronics\n2: Furniture\n3: Groceries\n4: Other");
            usrCategory = sc.nextInt();
            System.out.println("How many would you like to purchase? ");
            usrQuantity = sc.nextInt();

            switch (usrCategory) {
                case 1: if (usrQuantity >= 5) {payTotal += (usrQuantity * 100) * 0.9;}
                else {payTotal += usrQuantity * 100;} break;
                case 2:if (usrQuantity >= 3) {payTotal += (usrQuantity * 500) * 0.9;}
                else {payTotal += usrQuantity * 500;} break;
                case 3: if (usrQuantity >= 10) {payTotal += (usrQuantity * 20) * 0.9;}
                else {payTotal += usrQuantity * 20;} break;
                default: System.out.println("Input cost per item: ");
                double usrCost =  sc.nextDouble();
                payTotal += usrCost * usrQuantity; break;
            }

            System.out.println(MessageFormat.format("Your current total is: ${0}", payTotal));
            System.out.println("Would you like to continue shopping? y/n");
            char usr_answer = sc.next().charAt(0);
            switch (usr_answer) {
                case 'y': continue;
                default: quit = true;
                System.out.println(MessageFormat.format("That will be: ${0}. Thank you for shopping with us!", payTotal));
            }

        } while (quit == false);
        

        sc.close();
    }
    
}
