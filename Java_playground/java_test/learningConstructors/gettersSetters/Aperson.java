package Java_playground.java_test.learningConstructors.gettersSetters;

public class Aperson {
    private String fName;
    private String lName;
    private int age;

    Aperson(String fName, String lName, int age) {
        setfName(fName);
        setlName(lName);
        setAge(age);
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 1 && age <= 99) {
            this.age = age;
        } else {
            this.age = 20;
        }
        
    }
    public void setName(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void printDetails() {
        System.out.printf("First name: %s\nLast name: %s\nAge: %d", fName, lName, age);
    }

}

class Main {

    public static void main(String[] args) {
        Aperson person1 = new Aperson("Dave", "Davidsson", 200);
        person1.printDetails();
    }

}
