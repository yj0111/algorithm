import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(st.nextToken());
		
		//수직선위의 N개의 좌표
		int[] list = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		//list 를 똑같이 복제했어용
		int[] list_sort = list.clone();
		//오름차순으로 정렬함
		Arrays.sort(list_sort);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int cnt = 0;
		
		for(int i = 0; i<list_sort.length; i++) {
			//같은 값은 같은 순위? 여야 하니까! 
			//key값에 포함되면 저장 안하기 
			if(!map.containsKey(list_sort[i])) {
			map.put(list_sort[i], cnt++);
			}
		}

		//확인용
		//System.out.println(Arrays.toString(list));
		//System.out.println(Arrays.toString(list_sort));
		//System.out.println(map);
		
		for(int x : list) {
			bw.append(String.valueOf(map.get(x)+" "));
		}
		bw.flush();
	}
}