import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 
		int T = sc.nextInt();
		
		for(int i = 0 ; i<T; i++) {
			//자연수 N
			int N = sc.nextInt();
			
			//1~ 반
			Queue<String> q1 = new LinkedList<>();
			//반~ 맨끝
			Queue<String> q2 = new LinkedList<>();
			
			if(N%2 == 0) {//N이 짝수				
				for(int j = 0; j<N/2; j++) {
					q1.add(sc.next());
				}
				
				for(int k = N/2; k<N; k++) {
					q2.add(sc.next());
				}
			}else {
				for(int j = 0; j<=N/2; j++) {
					q1.add(sc.next());
				}
				
				for(int k = N/2+2; k<=N; k++) {
					q2.add(sc.next());
				}
			}
//			System.out.println(q1);
//			System.out.println(q2);
			System.out.print("#"+(i+1));
			
			int max = Math.max(q1.size(), q2.size());
			
			while(!(q1.isEmpty() && q2.isEmpty())) {
				if(max >= q1.size()) {
					System.out.print(" "+q1.poll());
				}
				if(max >= q2.size() && !(q2.isEmpty())) {
					System.out.print(" "+q2.poll());					
				}
			}
			System.out.println();
		}
	}

}