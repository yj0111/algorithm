import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int N = Integer.parseInt(br.readLine());
		
		//표
		int[] list = new int[N * N];
		int index =0;
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<N; j++) {
				list[index++] = Integer.parseInt(st.nextToken());
			}
		}
		/*
		//확인
		index =0;
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				System.out.print(list[index++]+" ");
			}
			System.out.println();
		}
		
		System.out.println("정렬 후");
		*/
		
		Arrays.sort(list);
		/*
		//확인
		index =0;
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				System.out.print(list[index++]+" ");
			}
			System.out.println();
		}
		*/
		
		//N번째로 큰수는 .. N*N 개 -N
		System.out.println(list[N*N -N]);
		
	}

}