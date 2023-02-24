import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1m^2에 자라는 참외의 개수
		int K = sc.nextInt();
		
		//방향저장
		int[] dir = new int[7];
		
		int[] len = new int[7];
		
		//6개의 꼭지점돌기
		for(int i = 0; i<6; i++) {
			// 방향
			dir[i] = sc.nextInt();
			// 길이
			len[i] = sc.nextInt();
		}
		
		dir[6] = dir[0];
		len[6] = len[0];
		
//		System.out.println(Arrays.toString(dir));
//		System.out.println(Arrays.toString(len));
		
		//제일 긴 가로 세로 구하기 
		int max_x = 0;
		int max_y = 0;
		for(int i = 0 ; i<6; i++) {
			if(dir[i] == 1 || dir[i] ==2) {
				if(max_x < len[i]) max_x = len[i];
			}else if(dir[i] == 3 || dir[i] ==4) {
				if(max_y < len[i]) max_y = len[i];
			}
		}
		
		//빼야하는 네모 
		int minus = 0;
		for(int j = 0; j<=4; j++) {
			if(dir[j] == 1 && dir[j+1] == 3 && dir[j+2] ==1 || dir[j] == 2 && dir[j+1] == 4 && dir[j+2] ==2 
					||dir[j] == 3 && dir[j+1] == 2 && dir[j+2] ==3 || dir[j] == 4 && dir[j+1] == 1 && dir[j+2] ==4) {
				minus = (len[j] * len[j+1]);
			}else if(dir[j] == 3 && dir[j+1] == 1 && dir[j+2] ==3 || dir[j] == 4 && dir[j+1] == 2 && dir[j+2] ==4 
					||dir[j] == 2 && dir[j+1] == 3 && dir[j+2] ==2 || dir[j] == 1 && dir[j+1] == 4 && dir[j+2] ==1) {
				minus = (len[j+1] * len[j+2]);
			}
		}
		
		
		//넓이
		int ground = max_x * max_y - minus;
//		System.out.println(ground);
		
		//참외 몇개 ? 
		int result = K * ground ;
		System.out.println(result);
		
	}
}