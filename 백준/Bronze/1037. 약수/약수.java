import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//약수의 개수
		int N = Integer.parseInt(st.nextToken());

		//약수 리스트
		int[] list = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(list);

		System.out.println(list[0] * list[N-1]);	
	}

}