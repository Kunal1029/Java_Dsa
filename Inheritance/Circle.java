package Inheritance;

class circ{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class rect extends circ{
    public double length;
    public double breadth;

    public double rectperimeter(){
        return 2*(length+breadth);
    }
    public double rectarea(){
        return length*breadth;
    }
}

class cylinder extends rect{
    public double height;
    public double volume(){
        return area()*height;
    }
}

public class Circle {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 7;
        c.height = 10;

        System.out.println("Volume "+c.volume());
        System.out.println("area "+c.area());
    }
}
