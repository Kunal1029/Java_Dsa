public class Shapes {
public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Circle c = new Circle();
    r.length=20;
    r.breadth=20;
    c.radius=20;
    // System.out.println(r.perimeter());
    // System.out.println(r.area());
    // System.out.println(c.perimeter());
    // System.out.println(c.area());
    // System.out.println("");

    shape s=r;
    shape s1=c;

    System.out.println(s.area());
    System.out.println(s1.perimeter());
}   

}

abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends shape{
    double length;
    double breadth;

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return (length+breadth);
    }
}
