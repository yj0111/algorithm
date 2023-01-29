import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		PriorityQueue<Integer> list = new PriorityQueue<>();
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