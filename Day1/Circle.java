import java.util.*;
class Circle{
    public double radius;

    public double area(){
        return Math.PI * radius *radius;
    }

    public double perimeter(){
        return 2*Math.PI * radius;
    }

    public double circumference(){
        return perimeter();
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Scanner sc = new Scanner(System.in);
        c1.radius = sc.nextDouble();
        c2.radius = sc.nextDouble();
        System.out.println("Area "+c1.area());
        System.out.println("circumference "+c1.circumference());
        System.out.println("perimeter " + c1.perimeter());
        System.out.println("Area "+c2.area());
        System.out.println("circumference "+c2.circumference());
        System.out.println("perimeter " + c2.perimeter());
    }
}