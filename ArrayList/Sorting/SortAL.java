package ArrayList.Sorting;
import java.util.ArrayList;
import java.util.Collections;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(213);
        list.add(223);
        list.add(123);
        list.add(230);
        list.add(213);

        System.out.println(list);

        //sort function using
        Collections.sort(list);
        System.out.println("Sorted list "+list); // ascending sort

        //For sorting descending order we use comparator
        Collections.sort(list,Collections.reverseOrder()); 
        System.out.println("Sorted list in descending order "+list);


        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1);
        System.out.println(list1.size());

    }
}
