import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		//스캐너 시간 초과 !!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//포켓몬 개수
		int N = Integer.parseInt(st.nextToken());
		
		//맞춰야하는 문제 수 
		int M = Integer.parseInt(st.nextToken());
		
		//포켓몬 리스트
		Map<String, String> pokemonMap = new HashMap<>();
		
		//찾기 쉽게 그냥 이름-번호, 번호-이름 등록해버리기
		for(int i = 1; i<=N; i++) {
			String name = br.readLine();
			String number = Integer.toString(i);
			pokemonMap.put(name, number);
			pokemonMap.put(number, name);
		}
		
		StringBuilder sb = new StringBuilder();
				
		for(int i= 0; i<M; i++) {
			sb.append(pokemonMap.get(br.readLine()) +"\n");
		}
			System.out.println(sb);
		}
		
}