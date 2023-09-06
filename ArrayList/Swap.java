package ArrayList;

import java.util.*;

public class Swap {
    public static void swaping(ArrayList<Integer> list , int idx1 , int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);


        int ind1 = 1;
        int ind2 = 3;

    //    System.out.println(swaping(list, ind1, ind2));
        System.out.println("Original list "+list);
        swaping(list, ind1, ind2);
        System.out.println("Fake list "+list);
    }

}
