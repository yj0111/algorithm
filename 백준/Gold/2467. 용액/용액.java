import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int left = 0;
        int right = N-1;
        int a = 0;
        int b = 0;
        long min = Long.MAX_VALUE;

        while(left < right){
            long sum = list[left] + list[right];

            if(min > Math.abs(sum) ){
                min = Math.abs(sum);
                a = left;
                b = right;
            }

            if(sum >= 0){
                right--;
            }else{
                left++;
            }
        }

        System.out.println(list[a]+" "+list[b]);

     }
}