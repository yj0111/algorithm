import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			int b = sc.nextInt();
			map.put(a, map.getOrDefault(a, 0) + b);
		}
		String answer = "NO";
		for (String key : map.keySet()) {
			if (map.get(key) == 5)
				answer = "YES";
		}
		System.out.println(answer);
	}
}