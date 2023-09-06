package ArrayList;
import java.util.*;
public class MaxiAL {
    public static void main(String[] args) {
        ArrayList<Integer> max = new ArrayList<>(); 
        max.add(23);
        max.add(12);
        max.add(213);
        max.add(230);
        max.add(123);
        
        int maxi = max.get(0);

        for(int i = 0;i<max.size();i++){
            if(maxi<max.get(i)){
                maxi = max.get(i);
            }
        }
        System.out.println("Al max " + maxi);

        // By using function

        int maxfun1 = Integer.MIN_VALUE;
        for(int i = 0;i<max.size();i++){
            // if(maxfun<max.get(i)){
            //     maxfun = max.get(i);
            // }
            maxfun1 = Math.max(maxfun1,max.get(i));
        }

        System.out.println("Maximun AL by funtion "+ maxfun1);
    }
}
