package Java_playground.java_test;
import java.text.MessageFormat;

public class Exercises2 {

    /* 
    2.1
    a: 11,  b: 12   c: 1
    
    2.2
    a: 10   b: 50   c: 80   d: 110  e: 18

    2.3
    a: 30   b: 45

    */ 

    // 2.4a
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {System.out.println(i+1);}

    // 2.4b
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;    
        }   
    // 2.4c
        int k = 9; 
        for (int j = 1; j <= 10; j++) {
            System.out.println(k * j);
        }

    // 2.4d
        int l = 10;
        while (l != 0) {
            System.out.println(l--);
        }
    
    // 2.4e
        int n = 0;
        for (int m = 0; m <= 10; m++) {
            if (m % 2 != 0) {System.out.println(n += m);}
        }
    }
    
    /* 
    2.1 - Additional exercises
    a: a=15,b=10   b: p = -5, q = 20   c: m = 48,n = 6  d: i = 4, j = 3
    e: c = 3, d = 2     f: e = 25, f = 5

    2.2 extra
    a: 27   b: 155  c: 693  d: 5    
    e: 105  f: 30 
  
    2.3 extra
    a: 25   b: 10   c: 18   d: 27
    e: 55
     */

}
