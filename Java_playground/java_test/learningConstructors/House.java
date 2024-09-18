package Java_playground.java_test.learningConstructors;

public class House {
    int squareMeters = 100;
    int floors = 1;
    int worth = 100000;
    int year = 1969;
    String adress = "33 Donovan ave.";

    House(int squareMeters, int floors, int worth, int year, String adress){
        this.squareMeters = squareMeters;
        this.floors = floors;
        this.worth = worth;
        this.year = year;
        this.adress = adress;
    }

    House(){
        
    }

    House(String homeAdress){
        this.adress = homeAdress;
    }

    public void printMyDetails() {
        System.out.println(String.format("The house has %d square meters\nIt has %d floors\nIt's worth $%d\nIt was built in %d\nAdress is %s", this.squareMeters, this.floors, this.worth, this.year, this.adress));
    }
    
}

class MyCar {
    String carModel = "Ford";
    int carWorth = 10000;
    double carKM = 122.6; //miles

    MyCar(String carModel, int carWorth, double carKM) {
        this.carModel = carModel;
        this.carWorth = carWorth;
        this.carKM = carKM;
    }
}

class Person {
    String name = "Johanna Johansson";
    String occupation = "Student";
    int age = 20;
    char sex = 'F';
    double length = 1.80;
    String homeAdress = "";

    Person (String name, String occupation, int age, char sex, double length, String homeAdress) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.sex = sex;
        this.length = length;
        this.homeAdress = homeAdress;
    }

    Person () {

    }

    public void printMyDetails() {
        System.out.println(String.format("Person is called %s\nPerson's occupation is %s\nPerson is %d years old\nPerson's sex is %c\nPerson is %1.2fcm long\nPerson lives on %s", this.name, this.occupation, this.age, this.sex, this.length, this.homeAdress));
    }
}



class main{

    public static void main(String[] args) {

        House myHouse1 = new House(300, 3, 250000, 1991, "22 Leighton str.");
        House myHouse2 = new House(250, 2, 175000, 2011, "55 Straton road");

        Person myPerson1 = new Person("David Davidsson", "Gardener", 33, 'M', 1.92, myHouse2.adress);
        Person myPerson2 = new Person("Harry Harrysson", "Software tester", 39, 'M', 1.74, myHouse1.adress);
        Person myPerson3 = new Person("Sally Sallydottir", "Singer", 22, 'F', 1.68, myHouse2.adress);


        myPerson1.printMyDetails();
        myPerson2.printMyDetails();
        myPerson3.printMyDetails();
  
  

    }
}
