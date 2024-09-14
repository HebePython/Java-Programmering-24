package Java_playground.java_test.BranchingStatements;

public class branchingStatements {

    //2.3a
    public static void main(String[] args) {
        //2.3a 
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0 ) {
                System.out.println(i);
                break;
            }
        }

        //2.3b
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {continue;}
            System.out.println(i);
        }
        //2.3c
        //1 check for uneven number of screws in batch -> skip over for manual inspection
        //2 check if more than 100 screws in batch, halt product checks
        //3 xtra: print all products rdy for shipping
    }
}
