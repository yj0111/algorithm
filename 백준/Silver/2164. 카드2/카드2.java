import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> list = new LinkedList<Integer>();
		
		//N까지 저장하고
		for(int i = 1; i<=N; i++) {
			list.add(i);
		}
		
		//하나 남을때까지 반복하기
		while(list.size() > 1) {
			//맨 처음꺼 버려
			list.poll();
			
			//맨 앞꺼 뒤로 보내기
			list.add(list.poll());
		}
		
		System.out.println(list.poll());
	}

}