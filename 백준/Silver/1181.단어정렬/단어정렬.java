import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] list = new String[N];

		sc.nextLine();
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextLine();
		}

		Arrays.sort(list, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을때
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});

		System.out.println(list[0]);

		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!list[i].equals(list[i - 1])) {
				System.out.println(list[i]);
			}
		}
	}

}
