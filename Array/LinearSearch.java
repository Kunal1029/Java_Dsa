package Array;

public class LinearSearch {
    public static int menu(int eat[] ,int mydish){
        for(int i=0;i<eat.length;i++){
            if(eat[i]==mydish){
                return i;
                
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int eat[] = {2,3,55,21,4};
        int dishNum = 211;
        int index = menu(eat, dishNum);
        if(index== -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Fount at " + index);
        }
        // for(int i = 0)
    }
}
