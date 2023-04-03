import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int N, M;
	static int[] degree;
	static ArrayList<Integer>[] list;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			sb = new StringBuilder();
			sb.append("#"+tc+" ");
			N = sc.nextInt();
			M = sc.nextInt();

			list = new ArrayList[N + 1];

			for (int i = 1; i <= N; i++) {
				list[i] = new ArrayList<>();
			}
			degree = new int[N + 1];
			
			int x, y;
			for (int i = 0; i < M; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				
				list[x].add(y);

				// y의 차수를 증가
				degree[y]++;
			}

			topologySort();
			System.out.println(sb);
		}
	}

	private static void topologySort() {
		Queue<Integer> queue = new LinkedList<>();

		// 차수가 0인 정점 큐에 넣기(선행 작업 없는 정점)
		for (int i = 1; i <= N; i++) {
			if (degree[i] == 0) {
				queue.add(i);
			}
		}

		// N번 돌면서 N개의 정점 확인
		for (int i = 1; i <= N; i++) {
			int k = queue.poll();

			sb.append(k).append(" ");

			// 차수를 1감소시킨 값이 0이면 큐에 넣기
			for (int conn : list[k]) {
				if (--degree[conn] == 0) {
					queue.add(conn);
				}
			}
		}
	}

}