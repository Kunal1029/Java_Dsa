package Data_hiding;

class Rect1 {
    private double length;
    private double breadth;

    public double get_klength() {
        return length;
    }

    public double get_kbreadth() {
        return breadth;
    }

    public void setlength(double l) {
        if (l >= 0) {
            length = l;

        } else {
            length = 0;

        }
    }

    public void setbreadth(double b) {
        if (b >= 0) {
            breadth = b;

        } else {
            breadth = 0;

        }
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public double area() {
        return length * breadth; // get_klength() * get_kbreadth();
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}

public class Rect {
    public static void main(String[] args) {
        Rect1 r1 = new Rect1();
        r1.setlength(10.5);
        r1.setbreadth(2.5);

        System.out.println("Area " + r1.perimeter());
        System.out.println("Area " + r1.area());
        System.out.println("IS this square " + r1.isSquare());

        System.out.println("length " + r1.get_klength());
        System.out.println("breadth " + r1.get_kbreadth());
    }
}
