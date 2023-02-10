import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		//ABC 입력받기
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int D =( A * B * C );
		
		//D 값을 문자열로 바꾸기
		String d = Integer.toString(D);
		
		for(int i = 0; i<10; i++) {
			int cnt = 0;
			for(int j = 0; j<d.length(); j++) {
				// charAt() 쓰면 - '0' / -'48' 써야함
				if((d.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
			
		}

	
	}
	
	
	
}