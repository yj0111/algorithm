package bj;

import java.util.Scanner;

public class hashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자의 길이
		int L = sc.nextInt();
		//입력받는 문자 
		String text = sc.next();
		
		//거듭제곱 곱한거의 합
		long sum = 0;
		long r = 1;
		int M = 1234567891;
		
		//Math.pow(a,b) 가 a의 b 거듭 제곱이래
		//Math.pow 쓰면 long 범위를 벗어나서 50 점 밖에 안된대요
		
		//그냥 매번 곱해주면서 더하기 
		for (int i = 0; i < L; i++) {
			sum+= ((text.charAt(i)-'a'+1)*r)%M;
			r = (r*31)%M;
		}
		
		System.out.println(sum%M);
		
	}
}
