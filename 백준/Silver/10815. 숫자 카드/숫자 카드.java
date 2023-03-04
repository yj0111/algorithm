import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Throwable, IOException {
		
		//스캐너 시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<Integer> list = new HashSet<>();
		
		for(int i = 0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> test = new ArrayList<>();
		
		//초기화
		st = new StringTokenizer(br.readLine());
		//비교 
		for(int j = 0; j<M; j++) {
			test.add(Integer.parseInt(st.nextToken()));
		}
		
		
		for(int m = 0; m<test.size(); m++) {
			if(list.contains(test.get(m))) {
				bw.append(1+" ");
			}else {
				bw.append(0+" ");
			}
		}
			
		bw.flush();
	}

}