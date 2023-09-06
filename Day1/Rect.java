

class Rect {
    public int length;
    public int breadth;

    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2*(length + breadth);
    }

public static void main(String[] args) {

    Rect r1 = new Rect();
    r1.length = 10;
    r1.breadth = 20;

    System.out.println("Area " + r1.area());
    System.out.println("Perimeter " + r1.perimeter());

}

}