import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//듣도 
		int N = Integer.parseInt(st.nextToken());	
		//보도
		int M = Integer.parseInt(st.nextToken());	
		
		// 듣도 못한 HashSet 으로 저장
		Set<String> set = new HashSet<String>();
		
		List<String> list = new ArrayList<String>();
		
		// 듣도 못한 사람 
		for(int i=0; i<N; i++) {	
			set.add(bf.readLine());	
		}
		
		//보도 못한 사람
		for(int i=0; i<M; i++) {
			String b_man = bf.readLine();
			
			//보도 못한 사람이 듣도에도 있으면 ! list 추가 
			if(set.contains(b_man)) {
				list.add(b_man);
			}
		
		Collections.sort(list);

		}
		//듣보 리스트 크키
		System.out.println(list.size());
		
		for(int j=0; j<list.size(); j++) {
			System.out.println(list.get(j));
		
		}
		
	}
}