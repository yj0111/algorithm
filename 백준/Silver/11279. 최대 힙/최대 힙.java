import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//최소 힙(1927)번 문제랑 똑같은 방법인데 
		//Collections.reverseOrder() 을 사용해서
		//내림차순으로 정렬해주면 됨!!
		
		PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
		int N = sc.nextInt();

		for(int i = 0; i<N; i++) {
			int num = sc.nextInt();
			
			//0이 아니면 추가하기
			if(num != 0) {
				list.offer(num);
			}else { //0이면
				if(list.isEmpty()) {//비어있으면 0 출력
					System.out.println(0);
				}else {
					System.out.println(list.poll());
				}
			}
		}
	}

}