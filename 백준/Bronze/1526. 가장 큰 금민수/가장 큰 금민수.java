import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N값 입력받기
		int N = sc.nextInt();

		// N 부터 만족하는 수까지 감소하면서 찾는다.
		for(int i=N; i>=4; i--) {
			boolean check = true;
			int num = i;
			while(num != 0) {
				// 끝자리가 4이거나 7일경우여야지 다음 자리수를 찾기 위해 10으로 나누기 !!
				if(num % 10 == 4 || num % 10 == 7)
					num /= 10;
				else {
					check = false;
					break;
				}
			}
			
			if(check) { //true 일때 
				System.out.println(i);
				break;
			}
		}
	}

}