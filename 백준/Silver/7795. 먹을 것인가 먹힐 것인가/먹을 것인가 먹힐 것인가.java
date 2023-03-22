import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		// 그냥 하나하나 해보는건 생각보다 오래 걸린다..!

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] A = new int[N];
			int[] B = new int[M];

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[j] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				B[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A);
			Arrays.sort(B);

			int cnt = 0;
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					if (A[j] <= B[j2]) {
						break;
					} else {
						cnt++;
					}
				}
			}

			/*이진탐색으로 푸는 방법
   			for (int j = 0; j < N; j++) {
			 	int start = 0; 
		 		int end = M-1;
			 	int idx = 0;
			 
			 while(start <= end) {
			    int mid = (start+end)/2;
			    
			    if(B[mid] < A[j]) {
			       start = mid+1;
			       idx = mid+1;
			    }else {
			       end = mid-1;
			    }
			    
			 }
			 cnt += idx;
			}
			
			 */
			bw.append(String.valueOf(cnt) + "\n");
		}

		bw.flush();
	}
}