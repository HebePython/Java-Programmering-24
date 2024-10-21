package Java_playground.java_test.Exercises_Challenges.E5Arrays;

public class ArraysExample {
    String[] names;

    public ArraysExample() {
        names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = "Name" + i;
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ArraysExample ae = new ArraysExample();
    }
}
