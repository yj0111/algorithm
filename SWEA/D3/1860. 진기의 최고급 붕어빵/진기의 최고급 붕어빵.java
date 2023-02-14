import java.util.Arrays;
import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //테스트 케이스
        int T = sc.nextInt();
         
        for(int t = 0; t<T; t++) {
             
            //N명이 자격을 얻음 
            int N = sc.nextInt();
             
            // 0초 ~ M초 까지 시간을 들이면
            int M = sc.nextInt();
             
            //K개 붕어빵
            int K = sc.nextInt();
             
             
            int[] son = new int[N];
             
            for(int i = 0; i<N; i++) {
                // 0 이상 11111이하
                son[i] = sc.nextInt();
            }
             
            //손님 오는 시간 빠른순으로 정렬 
            Arrays.sort(son);
            //System.out.println(Arrays.toString(son));
             
            boolean possible = true;
             
            //손님이 들어온 시간을 M으로 나눈뒤 K를 곱하기 
            //손님이 들어온 시간동안 만들 수 있는 빵의 개수구하기
            //손님이 몇번째인지 확인하고 만들수 있는 빵보다 온 사람의 수가 크면 false
             
            for(int i = 0; i<N; i++) {
                if(son[i]/M*K < i+1) {
                    possible = false;
                    break;
                }
            }
             
            if(possible == true) {
                System.out.println("#"+ (t+1) + " " + "Possible");
            }else {
                System.out.println("#"+ (t+1) + " " + "Impossible");
            }
         
        }
    }
}