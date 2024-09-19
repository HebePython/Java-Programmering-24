package Java_playground.java_test.learningConstructors.gettersSetters;

public class Aperson {
    private String fName;
    private String lName;
    private int age;
    static int persons; // upg 3

    Aperson(String fName, String lName, int age) {
        setName(fName, lName);
        setAge(age);
        setPersons(persons);
    }

    public String getName() {
        return fName;
    }
    public void setName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public int getAge() {
        return age;
    }
    public int getPersons() {
        return persons;
    }
    public void setPersons(int persons) {
        Aperson.persons += 1;
        System.out.printf("\nA new person has been added!\nThere are now %d persons.\n", Aperson.persons);
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
        System.out.printf("First name: %s\nLast name: %s\nAge: %d\n\n", 
        fName, lName, age);
        
    }

}

class Main {

    public static void main(String[] args) {

        System.out.println("We have added: " + Aperson.persons + " persons so far."); // 3.1

        Aperson person1 = new Aperson("Dave", "Davidsson", 200);
        Aperson person2 = new Aperson("Greg", "Gregsson", 33);
        Aperson person3 = new Aperson("Derek", "Frick", 55);

        person3.setName("Lisa", "Larsson");
        person2.setName("Trent");

        person1.printDetails();
        person2.printDetails();
        person3.printDetails();
        
    }

}
