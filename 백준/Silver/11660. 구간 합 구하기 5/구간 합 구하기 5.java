import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//표의 크기 NxN
		int N = Integer.parseInt(st.nextToken());
		int[][] list = new int[N+1][N+1];
		
		//합을 구해야 하는 횟수 
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int sum_n =0;
			for(int j = 1; j<=N; j++) {
				sum_n += Integer.parseInt(st.nextToken());
				list[i][j] += sum_n;
			}
		}
		
//		//누적합 배열로 만들어 
//		for(int i = 1; i<=N; i++) {
//			for(int j = 1; j<=N; j++) {
//				System.out.print(list[i][j]+" ");
//			}System.out.println();
//		}
		
		StringBuilder sb= new StringBuilder();
		//M번 실행
		for(int i = 0; i<M; i++) {
			//(x1,y1)~(x2,y2)
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = 0;
			for(int x = x1; x<=x2; x++) {
				result += (list[x][y2] - list[x][y1-1]);
			}
			sb.append(result+"\n");
		}
		System.out.println(sb);
	}
}