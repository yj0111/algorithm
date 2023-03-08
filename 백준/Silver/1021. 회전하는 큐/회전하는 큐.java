import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 큐의 크기
		int N = sc.nextInt();

		LinkedList<Integer> deque = new LinkedList<>();

		// 일단 1 부터 N까지 담아
		for (int j = 1; j <= N; j++) {
			deque.add(j);
		}

//		System.out.println(deque);

		// 뽑아 내려고 하는 수의 개수
		int M = sc.nextInt();
		// 리스트에 담기
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			list.add(sc.nextInt());
		}

//		System.out.println(list);
		// 이동하는 횟수
		int count = 0;

		for (int i = 0; i < M; i++) {
			// System.out.println(deque);
			// 찾으려고 하는 값의 인덱스
			int idx = deque.indexOf(list.get(i));
			// linkedlist 의 중간인덱스
			int mid;

			if (deque.size() % 2 == 0) {
				mid = deque.size() / 2 - 1;
			} else {
				mid = deque.size() / 2;
			}

			// 중간보다 작으면
			if (idx <= mid) {
				// 그 인덱스 전까지 다 빼서 뒤로 붙이기
				for (int j = 0; j < idx; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			} else if (idx > mid) {
				// 맨 뒤에 있는거 빼서 앞에 붙이기
				for (int j = 0; j < deque.size() - idx; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
//					System.out.println(deque);
					count++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(count);

	}
}