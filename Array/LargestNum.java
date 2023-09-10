package Array;

public class LargestNum {

    static int large(int[] arr){
        // int max=arr[0];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest " + min);
        return max;
    }
    public static void main(String[] args) {
        int[] arr= {22,33,132,122,3,55,99,88};
        int result = large(arr);
        System.out.println("largest array "+ result);
    }
}
