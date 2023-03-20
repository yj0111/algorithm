import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//갖고싶은 길이
		int X = sc.nextInt();
		
		//2진수로 바꾸기
		String str = Integer.toBinaryString(X);
		
		//1의 개수 카운트
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}