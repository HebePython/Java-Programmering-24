package Java_playground.java_test.Exercises_Challenges.E4Methods.StringManipulation;

public class myStringMethods {

    public String reverseString(String s){
        String revString = "";
        for (int i = s.length(); i > 0; i--) {
            revString += s.charAt(i - 1); 
        }
        return revString;
    }

    public int countCharacters(String s, char c) {
        int charCount = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) == c) {
                charCount++;
            }
        }
        return charCount;
    }
    
    public boolean isValidEmail(String s) {

        String[] domains = {".com", ".edu", ".org"};
        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) == '@') {
                for (int j = 1; j <= domains.length; j++) {
                    if (s.endsWith(domains[j - 1])) {
                        return true;
                    }
                }

            }
        }

        return false;
    }
}

class Main {

    public static void main(String[] args) {
        
        myStringMethods temp = new myStringMethods();
        String s = "Hello@gmail.edu";
        System.out.println(temp.reverseString(s));
        System.out.println(temp.countCharacters(s, 'l'));

        System.out.println(temp.isValidEmail(s));

    }
}