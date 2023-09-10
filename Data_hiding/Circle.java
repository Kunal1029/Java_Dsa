package Data_hiding;
// import java.lang.*;
class Cir{

    private double radius;


    public double getRadius(){ // this property for reading radius
        return radius;
    }

    public void setRadius(double r){// this property for writing radius
        if(r>0){
            radius = r;
        }
        else{
            radius = 0;
        }
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

}

public class Circle {
    public static void main(String[] args) {
        Cir c = new Cir();
        c.setRadius(20);
        System.out.println("Area " + c.area());
        System.out.println("Perimeter " + c.perimeter());
        System.out.println("radius " + c.getRadius());
    }
}
