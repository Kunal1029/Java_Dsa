public class Hospital {
    public static void main(String[] args) {
        Govtautority govt = new Myhospital();
        // govt.nurse();
        govt.admit();
        govt.emergency();
        govt.billing();
        // To call the nurse() method, you need to cast to Myhospital
        ((Myhospital) govt).nurse();
    }
}

abstract class Govtautority
{
   abstract void admit();
   abstract void emergency();
   abstract void billing();
}
class Myhospital extends Govtautority{
    Myhospital(){
        System.out.println("My hospital");
    }
    public void nurse(){
        System.out.println("I like nurses");
    }
    void admit(){
        System.out.println("Admit is govt policy");
    }
    void emergency(){
        System.out.println("emergency is govt policy");
    }
    void billing(){
        System.out.println("billing is govt policy");
    }
}
