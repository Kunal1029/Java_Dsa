package ArrayList;
import java.util.ArrayList;
// import java.util.Scanner;
public class ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> rev = new ArrayList<>();
        rev.add(2);
        rev.add(22);
        rev.add(12);
        rev.add(21);
        // System.out.println("Enter elements u wanna store");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        for(int i = rev.size()-1;i>=0;i--){
           System.out.println(" "+rev.get(i));
        }
    }
}
