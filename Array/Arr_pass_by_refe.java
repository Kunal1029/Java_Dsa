package Array;

public class Arr_pass_by_refe {
    static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {
        int num[] = {90,95,99};
        update(num);
        // System.out.println();
        for(int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
