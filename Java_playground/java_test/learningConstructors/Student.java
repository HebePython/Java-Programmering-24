package Java_playground.java_test.learningConstructors;
import java.text.MessageFormat;

public class Student {
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
