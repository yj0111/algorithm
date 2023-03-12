import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[] list = new int[N+1];
		
		//0,1 은 어짜피 소수 아니니까 넘어가고 2부터 넣어주기 
        for (int i = 2; i <= N; i++) {
        	list[i] = i;
        }
        
        //System.out.println(Arrays.toString(list));
		
        for (int i = 2; i <= N; i++) {
        	
        	//0이면 넘어가!
        	if(list[i] == 0) continue;
        	
        	//i의 배수들을 0으로 바꾸기 
        	for(int j = i+i; j<=N; j+=i) {
        		list[j] = 0;
                //System.out.println(Arrays.toString(list));
        	}
        }
        
        for (int i = 0; i < list.length; i++) {
			if(list[i]>=M && list[i]<=N) {
				System.out.println(list[i]);
			}
		}
        
	}
}