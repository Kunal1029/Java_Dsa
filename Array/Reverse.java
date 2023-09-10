package Array;

public class Reverse {
    static void Reverse(int[] rev){
        int first = 0;
        int last = rev.length-1;
        while(first<last){
            int temp=rev[first];
            rev[first]=rev[last];
            rev[last]=temp;

            first++;
            last--;
        }
        // return 1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
}
