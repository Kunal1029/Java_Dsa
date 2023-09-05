import java.util.ArrayList;
public class Operations_AL {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        //Add element operations

        list1.add(2); // O(1) - Time complexity
        System.out.println(list1);
        list1.add(12);
        list1.add(2);
        list1.add(01);
        list1.add(29);

        // .add(index,value)
        list1.add(5,9); // O(n) -linear Time complexity
        System.out.println(list1);
        list1.add(1,19); // O(n) -linear Time complexity
        System.out.println(list1);


        // Get element operation

        int element = list1.get(2); // O(1) - Time complexity
        int element1 = list1.get(4);
        // int element1 = list1.get(5);
        System.out.println(element);
        System.out.println(element1);

        // remove element operation

        list1.remove(3);  // O(n) -linear Time complexity
        System.out.println(list1); 

        // Set element operation
        // .set(index,value);
        list1.set(2,10); // O(n) -linear Time complexity
        System.out.println(list1);

        // Containes element - it checks that any element is exit or not
        System.out.println(list1.contains(1));// O(n) -linear Time complexity
        System.out.println(list1.contains(10));// O(n) -linear Time complexity


        // size() it is function
        System.out.println(list1.size());

        //print arraylist
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("");


        // we use access element by using get operation
    }
}
