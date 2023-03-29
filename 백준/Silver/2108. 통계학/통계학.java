import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); 
		int[] arr = new int[N]; 
		// 산술평균
		int a = 0; 
		// 중앙값
		int b = 0; 
		// 최빈값
		int c = 0; 
		// 범위
		int d = 0; 
		
		// 숫자 입력
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 1.산술평균
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += arr[i];
		}
		a = (int)Math.round(((double)sum /N));
		
		// 2.중앙값
		Arrays.sort(arr);
		b = arr[N/2];

		// 3.최빈값
		int[] plus = new int[4002];
		int[] minus = new int[4001];
		for(int i=0;i<N;i++) {
			if(arr[i] <0) {
				minus[Math.abs(arr[i])]++;
			}
			else {
				plus[arr[i]]++;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//빈도수 체크
		int max = 0;
		for(int i=0; i<plus.length;i++) {
			max = Math.max(max, plus[i]);
			
		}
		for(int i=0; i<minus.length;i++) {
			max = Math.max(max, minus[i]);
		}
		
		//빈도수 높은 친구들 ArrayList에 담기
		for(int i : arr) {
			if(i<0) {
				if(minus[Math.abs(i)] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
			else {
				if(plus[i] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
		}
		
		// 2개 이상이면 2번째로 작은 것 출력
		if(list.size()>=2) {
			c = list.get(1);
		}
		else {
			c = list.get(0);
		}
		
		// 범위
		d = arr[N-1] - arr[0];
		
		bw.append(String.valueOf(a)+"\n");
		bw.append(String.valueOf(b)+"\n");
		bw.append(String.valueOf(c)+"\n");
		bw.append(String.valueOf(d));
		
		bw.flush();
	}
}