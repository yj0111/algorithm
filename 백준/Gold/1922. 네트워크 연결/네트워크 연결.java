import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int[] p;
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//도시의 개수
		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		//버스의 개수
		M = Integer.parseInt(st.nextToken());
		
		
		int[][] edges = new int[M][3];
		
		for (int i = 0; i <M; i++) {
			st = new StringTokenizer(br.readLine());
			edges[i][0] = Integer.parseInt(st.nextToken());
			edges[i][1] = Integer.parseInt(st.nextToken());
			edges[i][2] = Integer.parseInt(st.nextToken());
		}
		
		
		//1.정렬하기
		Arrays.sort(edges, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		
		//2.makeset
		p = new int[N+1];
		makeset();
		
		int result = 0;
		
		for (int i = 0; i < M; i++) {
			if(union(edges[i][0],edges[i][1])){
				result += edges[i][2];
			}
		}
		bw.append(String.valueOf(result));
		bw.flush();
		
	}
	
	static void makeset() {
		for (int i = 1; i <= N; i++) {
			p[i] = i;
		}
	}
	
	//3.findset
	static int findset(int a) {
		if(p[a] == a) {
			return a;
		}else {
			return p[a] = findset(p[a]);
		}
	}
	
	static boolean union(int a , int b) {
		int aRoot = findset(a);
		int bRoot = findset(b);
		
		if(aRoot != bRoot) {
			p[bRoot] = aRoot;
			return true;
		}
		return false;
	}
	
}