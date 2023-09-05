import java.util.*;
public class Reverse_AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Without reverse " + list);
System.out.print("Reverse ");
        for(int i = list.size() - 1;i>=0;i--){
            System.out.print(" " + list.get(i));
        }
System.out.println("2nd way");
        System.out.print("Reverse ");
        for(int i = 0;i<list.size();i++){
            System.out.print(" " + list.get(list.size()-1 - i));
        }
        System.out.println("3rd way");
        System.out.print("Reverse ");
        for(int i = 1;i<=list.size();i++){
            System.out.print(" " + list.get(list.size()- i));
        }
    }
}
