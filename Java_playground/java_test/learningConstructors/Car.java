package Java_playground.java_test.learningConstructors;
import java.text.MessageFormat;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car() {
        this("Mustang", "R8", 1969, "Red");
    }


    public Car(String carMake, String carModel, int carYear, String carColor) {
        this.make = carMake;
        this.model = carModel;
        this.year = carYear;
        this.color = carColor;
    }



    public static void main(String[] args) {
        Car car1 = new Car("Ford", "T-ford", 1924, "Black");
        System.out.println(MessageFormat.format("{0}", car1.make));
        Car car2 = new Car();
        System.out.println(car2.color);
    }
    
}
