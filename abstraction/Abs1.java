public class Abs1 {
    public static void main(String[] args) {
        super1 s1 = new sub1();
        s1.meth1();
        s1.meth2();
    }
}
abstract class super1{
    super1(){
        System.out.println("Super class");
    }
    void meth1(){
        System.out.println("Super meth1");
    }
    abstract void meth2();
}
class sub1 extends super1{
    void meth2(){
        System.out.println("Sub meth2");
    }
}

