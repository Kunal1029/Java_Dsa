package Constructors;

class Rectangle {
    public double length;
    public double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // constructor with parameter
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // constructor with single parameter
    public Rectangle(double s) {
        length = breadth = s;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }

}

public class RectwithSetGet {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 2);
        // r.length=10.5;
        // r.breadth=5.5;

        System.out.println("Area" + r.area());
        System.out.println("perimeter" + r.perimeter());

        System.out.println("Is it a Square" + r.isSquare());
    }

}
