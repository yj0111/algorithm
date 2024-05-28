import java.util.*;
//용돈관리
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N일
        int M = sc.nextInt(); // M번
        int[] money = new int[N];

        int min = 1;
        int max = 1;

        for(int i = 0; i<N; i++){
            money[i] = sc.nextInt();
            min = Math.max(min,money[i]);
            max += money[i];
        }

        int mid;
        int count;
        int sum;

        while(min <= max){
            mid = (max+min)/2;
            sum = 0;
            count = 1;

            for(int i = 0; i<N; i++){
                sum += money[i];
                if(sum > mid){
                    sum = money[i];
                    count++;
                }
            }

            if(count > M){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        System.out.println(min);
    }
}