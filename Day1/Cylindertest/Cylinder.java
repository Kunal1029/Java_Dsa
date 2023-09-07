package Cylindertest;

class cylinderTest { // can make class by any name
    public double radius;
    public double height;
    
    public double lidArea(){
        return Math.PI * radius * radius;
    } 

    public double circumference(){
        return 2*Math.PI*radius;
    }


    public double tsa(){
        return 2*lidArea()+circumference()*height;
    }

    public double volume(){
        return lidArea()*height;
    }
}

public class Cylinder  { // file name
    public static void main(String[] args) {
        cylinderTest c = new cylinderTest();
        c.radius = 7;
        c.height = 10;

        System.out.println("lidArea "+ c.lidArea());
        System.out.println("Surface "+ c.tsa());
        System.out.println("circumference "+ c.circumference());
        System.out.println("volume "+ c.volume());
    }
}
