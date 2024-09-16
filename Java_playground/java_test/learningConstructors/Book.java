package Java_playground.java_test.learningConstructors;
import java.text.MessageFormat;

public class Book {
    int year;
    String author;
    String title;

    public static void main(String[] args) {

        Book LOTRBook = new Book();
        System.out.println(LOTRBook.year + LOTRBook.author + LOTRBook.title);

    }
}

class Student {
    double grade;
    String name;
    int age;

    public Student(double studentGrade, String studentName, int studentAge) {
        this.grade = studentGrade;
        this.name = studentName;
        this.age = studentAge;

    }

    public static void main(String[] args) {

        Student student1 = new Student(7.25, "Hank", 16);
        System.out.println(MessageFormat.format("Student name: {1}\nStudent grade: {0}\nStudent age: {2}", student1.grade, student1.name, student1.age));

        
    }

}

class Car {
    String make;
    String model;
    int year;
    String color;

    Car() {
        this("Mustang", "R8", 1969, "Red");
    }


    public Car(String carMake, String carModel, int carYear, String carColor) {
        make = carMake;
        model = carModel;
        year = carYear;
        color = carColor;
    }



    public static void main(String[] args) {
        Car car1 = new Car("Ford", "T-ford", 1924, "Black");
        System.out.println(MessageFormat.format("{0}", car1.make));
        Car car2 = new Car();
        System.out.println(car2.color);
    }
    
}