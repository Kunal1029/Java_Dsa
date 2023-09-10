
package Constructors;

class Rect{
    private double length;
    private double breadth;
    
    //constructor without parameter
    public Rect(){ 
        length = 1;
        breadth=1;
    }
     //constructor with parameter
    public Rect(double l, double b){
        length = l;
        breadth = b;
    }
     //constructor with single parameter
    public Rect(double s){
        length = breadth = s;
    }
    
    public double area(){
        return length*breadth;
    }
    
}

public class Rectangle {

    public static void main(String[] args) {
        
//        Rect r = new Rect(10,5);
//         Rect r = new Rect();
          Rect r = new Rect(12);
        System.out.println("Area " + r.area());
    }
    
}
