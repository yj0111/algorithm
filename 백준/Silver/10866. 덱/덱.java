import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//시간이 0.5초.. ! 
		StringBuilder sb = new StringBuilder();
		
		//명령의 수 
		int N = Integer.parseInt(br.readLine());
		//deque: 양쪽에서 삽입 삭제 가능한 큐 
		Deque<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String order = st.nextToken();
			
			switch (order) {
			case "push_front":
				int num = Integer.parseInt(st.nextToken());
				queue.addFirst(num);
				break;
			case "push_back":
				num = Integer.parseInt(st.nextToken());
				queue.addLast(num);
				break;
			case "pop_front":
				if(queue.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(queue.pollFirst()).append('\n');
				}
				break;
			case "pop_back":
				if(queue.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(queue.pollLast()).append('\n');
				}
				break;
			case "size":
				sb.append(queue.size()).append('\n');
				break;
			case "empty":
				if(queue.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				break;
			case "front":
				if(queue.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(queue.peekFirst()).append('\n');
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(queue.peekLast()).append('\n');
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb);	
	}
}