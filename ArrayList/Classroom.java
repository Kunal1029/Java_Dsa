package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        // classes uses in arraylist as datatype - Float | Integer | String | Boolean
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();

       //operations
       //add function
       list.add(1); // O(1)
       list.add(2);
       list.add(3);
       list.add(15);

       System.out.println("Add operation "+list);
       
       // add any element at any index without removing any element // O(n)
       // list.add(index,element)

       list.add(2,1028);
       System.out.println(list);
           

       //Get element operations -O(1)
       int element = list.get(2);
       System.out.println("Get operation " + element);

       //Delete / remove element - O(n)
       list.remove(2);
       System.out.println("Remove operation "+list);

       // Set element at index operation - O(n)
       list.set(2, 1029); // remove 2 element and add 1029
       System.out.println("Set element operation " + list);

       //Contains elements - )=O(n)
       // this check any element exit on list or not
        System.out.println("Contain element operation - " + list.contains(1));
        System.out.println("Set element operation - " + list.contains(11));
    

        //Size of AL

        System.out.println("Size of array "+list.size());
        //AL iteration

        for(int i = 0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
        System.out.println();
    }
}
