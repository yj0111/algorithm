import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] list = new int[N];
		
		//수열 저장 
		for(int i = 0; i<N; i++) {
			list[i] = sc.nextInt();
		}
		
		//결과 
		//커지는 경우, 작아지는 경우 각각 출력하니까 오류뜬당
		int result = 1;
				
		//커지는거
		int cnt = 1;
		
		for(int i = 0; i<N-1; i++) {
			if(list[i] <= list[i+1]) {
				cnt++;
			}else {
				cnt = 1;
			}
			
			if(result < cnt) {
				result = cnt;
			}
		}
		
		//작아지는거
		int rcnt =1;
		for(int i = 0; i <N-1; i++ ) {
			if(list[i] >= list[i+1]) {
				rcnt++;
			}else {
				rcnt = 1;
			}
			
			if(result < rcnt) {
				result = rcnt;
			}
		}

		System.out.println(result);
		
	}
}