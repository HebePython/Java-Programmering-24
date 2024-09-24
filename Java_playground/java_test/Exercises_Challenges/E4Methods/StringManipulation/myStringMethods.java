package Java_playground.java_test.Exercises_Challenges.E4Methods.StringManipulation;

public class myStringMethods {

    public String reverseString(String s){
        String revString = "";
        for (int i = s.length(); i > 0; i--) {
            revString += s.charAt(i - 1); 
        }
        return revString;
    }
    
}

class Main {

    public static void main(String[] args) {
        
        myStringMethods temp = new myStringMethods();

        System.out.println(temp.reverseString("Hello"));

    }
}