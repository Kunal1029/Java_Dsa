package Day0;
// Question - https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

// import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
          int s=0,p=0;
          int a = sc.nextInt();
          int b = sc.nextInt();
          int n = sc.nextInt();
          sc.close();
          for(int j = 0;j<n;j++)
          {
            int ans = 0;
            p = (int)(Math.pow(2, j));
            s = s + (p*b);
            ans = s + a;
            System.out.print(ans + " ");
          }
          System.out.println("");
        }
        
    }
}
