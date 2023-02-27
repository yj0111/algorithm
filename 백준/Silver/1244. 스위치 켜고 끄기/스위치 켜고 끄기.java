import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//스위치 개수
		int T = sc.nextInt();
		
		int[] list = new int[T+1];
		
		for(int i = 1; i<=T; i++) {
			list[i] = sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(list));
		
		//학생 수
		int p = sc.nextInt();
		
		for(int i = 0; i<p; i++) {
			//성별 (남 1 여2)
			int gen = sc.nextInt();
			//스위치 위치 
			int cnt = sc.nextInt();
			
			//남자면 
			if(gen == 1) {
				for(int j = 1; j<T+1; j++) {
					if(j % cnt == 0) {
						if(list[j] == 0) {
							list[j] = 1;
						}else {
							list[j] = 0;
						}
					}
				}
			}else if(gen == 2) { //여자면 
					if(list[cnt] == 0) {
						list[cnt] = 1;
					}else {
						list[cnt] = 0;
					}
				for(int j = 1; j<cnt; j++) {
					if(cnt-j > 0 && cnt+j <T+1) {
						if(list[cnt-j] == list[cnt+j]) {
							if(list[cnt-j] == 0 && list[cnt+j] == 0) {
								list[cnt-j] = 1;
								list[cnt+j] = 1;
							}else {
								list[cnt-j] = 0;
								list[cnt+j] = 0;
							}
						}else {
							break;
						}
					}
				}
			}
		}
		//한 줄에 20개씩 출력
		for(int i=1; i<=T; i++) {
			System.out.print(list[i] + " ");
			if(i % 20 == 0)
				System.out.println();
		}
	}

}