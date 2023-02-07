import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//총 일수
		int N = Integer.parseInt(st.nextToken());
		//연속 합
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		//처음부터 K개씩 묶기
		for(int i = 0; i<=N-K; i++) {
			sum = 0;
			for(int j = i; j<i+K; j++) {
				sum += list.get(j);
			}
			max = Math.max(max, sum);
		}
		
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}
}