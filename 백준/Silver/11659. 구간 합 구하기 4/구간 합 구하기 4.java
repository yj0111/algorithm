import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] S = new long[N+1];
		
		st = new StringTokenizer(bufferedReader.readLine());
		
		//누적합
		for(int i = 1; i<=N; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < M; j++) {
			st = new StringTokenizer(bufferedReader.readLine());
			int k = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(S[m] - S[k-1] );	
		}
	}
}