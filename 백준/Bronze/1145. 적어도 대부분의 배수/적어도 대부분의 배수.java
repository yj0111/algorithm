import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int count = 0;
		int N = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(true) {
			N++;
			for(int i = 0; i < 5; i++) {
				if(N >= arr[i] && N % arr[i] == 0) count++;
			}
			if(count > 2) break;
			count = 0;
		}
		System.out.println(N);
	}

}