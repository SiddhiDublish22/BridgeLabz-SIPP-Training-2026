package ClassAndObject.Level1;

class Circle {

    double radius;

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }

    void circumference() {
        double c = 2 * 3.14 * radius;
        System.out.println("Circumference = " + c);
    }
}

public class CircleDemo {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.radius = 5;

        c.area();
        c.circumference();
    }
}