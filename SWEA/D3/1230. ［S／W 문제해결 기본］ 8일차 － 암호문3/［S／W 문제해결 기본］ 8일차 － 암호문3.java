import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t = 0 ; t<10 ; t++) {

		//원본 암호문의 길이
		int N = sc.nextInt();
		
		//암호문 배열 넣기 
		LinkedList<Integer> list = new LinkedList<>();
		
		//원본 암호문
		for(int i = 0; i<N; i++) {
			list.add(sc.nextInt());
		}
		
		//명령어 개수
		int X = sc.nextInt();
		while(X>0) {
			String text = sc.next();
			
			switch (text) {
			case "I": int x = sc.nextInt();
				int y = sc.nextInt();
				for(int k = 0; k<y; k++) {
					list.add(x, sc.nextInt());
					x++;
				}
				break;
			case "D": int x2= sc.nextInt();
			int y2 = sc.nextInt();
				for(int k = 0; k<y2; k++) {
					list.remove(x2);
				}
				break;
			case "A" : int y3 = sc.nextInt();	
			for(int k = 0 ; k<y3; k++) {
				list.add(sc.nextInt());
			}
				break;
			default:
				break;
			}
			X--;
		}

		//출력
			System.out.print("#"+(t+1));
			for(int m = 0; m<10; m++) {
				System.out.printf("%7d",list.pop());
			}System.out.println();
		
	}
		
	}

}