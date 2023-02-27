import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//총 사람수 
		int N = sc.nextInt();
		//몇번째?
		int K = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		//사람들 넣기
		for(int i = 1; i<=N; i++) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
        sb.append("<");

        //사이즈 1 될때까지 반복
		while(q.size() != 1) {
			for(int i = 0; i<K-1; i++) {
				//K번째 전까지는 뒤로 넣기
				q.offer(q.poll());
			}
			//K번째인거 꺼내기
		sb.append(q.poll() + ", ");
		}
		
		//1개 남으면 마지막에 꺼내기
		sb.append(q.poll() + ">");
		
		System.out.println(sb);
	}
}