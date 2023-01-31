import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		//사람 리스트
		int[] list = new int[N+1];
		//헷갈리니까 list[0] 은 없는걸로 치기
		
		//공 던지기 횟수 
		int count = 0;
		
		list[1] = 1;
		int ball = 1;

		
		while(true) {
			if(list[ball] == M) {
				break;
			}
			
			if(list[ball] %2 == 1) {	//홀수번이면
				ball = ball + L;	//시계 방향
			}else {
				ball = ball - L;	//반시계 방향
			}
			
			if(ball > N) { 			//범위를 벗어나면
				ball %= N;	
			}else if(ball < 1) {
				ball += N;
			}
			list[ball]++;
			count++;
			
		}
		System.out.println(count);
		//System.out.println(Arrays.toString(list));
		
		
		
	}

}