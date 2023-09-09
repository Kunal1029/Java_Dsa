package ArrayList;
import java.util.ArrayList;

public class MultiD_AL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>(); 
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        
        for(int i = 1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        System.out.println(mainlist);

        list1.remove(1);
        list3.remove(3);

        //print all list by using nested loops
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> currentList = mainlist.get(i);
            for(int j = 0;j<currentList.size();j++){
                System.out.print(" " +currentList.get(j));
            }
            System.out.println();
        }
    }
}
