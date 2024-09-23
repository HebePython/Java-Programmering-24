package Java_playground.java_test.Exercises_Challenges.E4Methods.Geometry;

public class Circle {
    private double radius;
    private double diameter;

    public Circle() {}

    public Circle (double radius, double diameter) { //constructor
        setRadius(radius);
        setDiameter(diameter);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleArea (double r, double d) {
        double y = 0;
        if (r != 0) {
            y = Math.pow(r, 2) * Math.PI; //if have radius
        } else if (d != 0) {
            y = (Math.PI / 4.0) * Math.pow(d, 2); //if have diameter
        }
        return y; 
    } 

    public double circleCircm(double r) {
        double y = r * 2.0 * Math.PI;
        return y;
    }
    
}

class Rectangle {
    private double height;
    private double length;

    public Rectangle() {}

    public Rectangle(double height, double length) {
        setHeight(height);
        setLength(length);
    }

    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double rectangleArea(double height, double length) {
        return height * length;
    }
    public double rectanglePerimeter(double height, double length) {
        return height * length * 2.0;
    }

}

class GeometryTester {

    public static void main(String[] args) {

        Circle temp1 = new Circle();
        System.out.println(temp1.CircleArea(2.5, 0));
        System.out.println(temp1.CircleCircm(4));

        Rectangle temp2 = new Rectangle();
        System.out.println(temp2.rectangleArea(2, 2));
        System.out.println(temp2.rectanglePerimeter(2, 2));
    }
}