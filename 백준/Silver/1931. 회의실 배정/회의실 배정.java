import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class 회의실 배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		// 회의 개수
		int N = sc.nextInt();
		int last = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			// 시작시간
			int X = sc.nextInt();
			// 끝나는 시간
			int Y = sc.nextInt();

			if (!map.containsKey(Y)) {
				map.put(Y, new ArrayList<>());
			}
			//끝나는 시간에 시작 시간 추가 
			map.get(Y).add(X);
		}

		//System.out.println(map);
		ArrayList<Integer> keys = new ArrayList<>();

		for (int i : map.keySet())
			keys.add(i);
		//오름차순 정렬하기 
		Collections.sort(keys);

		for (int i : keys) {
			Collections.sort(map.get(i));
			for (int j : map.get(i)) {
				if (j >= last) {
					last = i;
					count++;
				}
			}
		}
		
		//System.out.println(keys);
		System.out.println(count);
	}
}
