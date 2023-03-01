import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//사이트 비번 저장
		int N = Integer.parseInt(st.nextToken());
		
		//찾고싶은 사이트
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new HashMap<>();
		
        //map k-v에 저장하기
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		//map k 로 찾기
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			bw.append(map.get(st.nextToken())+"\n");
		}
		bw.flush();
		bw.close();
	}

}