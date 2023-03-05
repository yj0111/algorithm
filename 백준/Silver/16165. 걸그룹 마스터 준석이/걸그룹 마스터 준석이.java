import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		// 걸그룹
		HashMap<String, String> map = new HashMap<String, String>();
		String buf = "";
		// 총 그룹 수
		int N = sc.nextInt();
		// 맞춰야 하는 문제 수
		int M = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String group = sc.next();
			int member = sc.nextInt();
			buf = sc.nextLine();

			String mem = "";
			// k - 그룹명, value - 멤버이름
			for (int j = 0; j < member; j++) {
				String name = sc.nextLine();
				mem += name + " ";
			}

			map.put(group, mem);
		}

		for (int i = 0; i < M; i++) {
			//맞출라고 입력받는거
			String what = sc.nextLine();
			
			int quiz = sc.nextInt();
			buf = sc.nextLine();
			String key = "";
			String mem = "";

			List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(map.entrySet());

			if (quiz == 1) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getValue().contains(what)) {
						key = list.get(j).getKey();
						break;
					}
				}

				sb.append(key+"\n");
			}

			else if(quiz == 0){
				String temp = map.get(what);
				String[] result = temp.split(" ");
				Arrays.sort(result);

				for (String r : result) {
					sb.append(r+"\n");
				}
			}
		}

		System.out.println(sb.substring(0, sb.length() - 1));
	}
}