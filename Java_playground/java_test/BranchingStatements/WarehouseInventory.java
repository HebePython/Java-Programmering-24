package Java_playground.java_test.BranchingStatements;
import java.text.MessageFormat;
import java.util.Scanner;

public class WarehouseInventory {
    public static void main(String[] args) {
        // You don't need to care about these variables for now
       
        Scanner scanner = new Scanner(System.in);
       // Note to self, this lady doesn't seem to like paying programmers
       // To do: Sue her so I can extend my vacation
        int maxItems = 110;
        int minItems = 15;
        int maxBatch = 10;
        int minBatch = 3;
        int batchesRdy = 0;
        int totalItems =0;
        int productsToShip = 0;
        boolean rdyToShip = true;
 
        // Play around with different amounts of products to check
        System.out.print("Enter the number of products to check: ");
        int numProducts = scanner.nextInt();
 
        // Loop through each product
        for (int product = 1; product <= numProducts; product++) {
            System.out.println("\nChecking product " + product);
 
            // Sets the number of matches between minBatch and maxBatch
            int numBatches = minBatch + (int) (Math.random() * ((maxBatch - minBatch) + 1));
            System.out.println("This product has a total of " + numBatches + " batches.");
 
            // Loop through each batch for the current product
            for (int batch = 1; batch <= numBatches; batch++) { rdyToShip = true;
                // Just anouther 120 hours and I will be in the Beeeermuuuuudaaa Triaaangllleee   
                int numItems = minItems + (int) (Math.random() * ((maxItems - minItems) + 1));
                
                if (numItems % 2 != 0) {System.out.println("Need manual inspection");
                batchesRdy += 1; totalItems += numItems; 
                    continue;
            }   else if (numItems > 100){System.out.println("Too many screws!");
                    rdyToShip = false;
                    break;
            }   else { System.out.println("number of items: " + numItems);
            batchesRdy += 1; totalItems += numItems;

            }

            }
            if (rdyToShip == true) {productsToShip += 1;}
        }
        System.out.println("Warehouse inventory check complete.");
        System.out.println("Now can you please pay your programmer?!");
        System.out.println(MessageFormat.format("{0} products, {1} batches and {2} items are ready to ship!", productsToShip, batchesRdy, totalItems));

        scanner.close();
    }
 }