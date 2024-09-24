package Java_playground.java_test.Exercises_Challenges.E4Methods.Mathstuff;

public class myMathMethods {

    public double calculateFactorial(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
        }
        return fact;
        }
        
    }

    public int fib(int num) {
        if (num <= 1) {
            return num;
        }

        return fib(num - 1) + fib(num - 2); //recursive, call own method.
    }

    public int calculateFibonacci(int num) {
        
        int x = 0;

        for (int i = 0; i < num; i++) {
            x = fib(i);    
        }
        return x;
    }   
    
    public boolean isPrime(int n) { //kolla mera.
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                
                return false;
            }

        }
        return true;
        
    }
}



class Main {

    public static void main(String[] args) {
        myMathMethods temp1 = new myMathMethods();
        System.out.println(temp1.calculateFactorial(5));

        int n = 17;
        System.out.println(temp1.calculateFibonacci(n));
        System.out.println(temp1.isPrime(n));

    }
}