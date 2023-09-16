public class KFC {
    public static void main(String[] args) {
        KFc k = new MyKFC();
        k.billing();
        k.offer();
        k.makeItems();
        
    }
}

abstract class KFc{

    KFc(){
        System.out.println("Hi welcome to KFC");
    }
    void makeItems(){
        System.out.println("AAlu, Paneer");
    }
    abstract void billing();
    abstract void offer();

}

class MyKFC extends KFc{
    MyKFC(){
        System.out.println("THIS is GWALIOR KFC");
    }
    @Override
    void billing(){
        System.out.println("Bill Department");
    }
    @Override
    void offer(){
        System.out.println("OFFERS are available");
    }
    void parking(){
        System.out.println("Parking park");
    }
}
