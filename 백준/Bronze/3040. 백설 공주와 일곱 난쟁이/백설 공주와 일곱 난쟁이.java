import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//난쟁이 9명
		int[] list = new int[9];
		int sum = 0;

		//아홉명을 리스트에 담고, 총 합 구하기
		for(int i = 0; i< 9; i++) {
			list[i] = sc.nextInt();
			sum += list[i];
		}

		//난쟁이 아닌 2명 합
		int find = sum - 100;

		//난쟁이 아닌 2명
		int nj1 = 0;
		int nj2 = 0;

		for(int i = 0; i<8; i++) {
			for(int j = i+1; j<9; j++) {
				if(list[i] + list[j] == find && i != j) {
					nj1 = list[i];
					nj2 = list[j];
				}
			}
		}

		//일곱 난쟁이 리스트
		int[] seven = new int[9];

		for(int i = 0; i<9; i++) {
			if(list[i] != nj1 && list[i] != nj2) {
				seven[i] = list[i];
			}
		}

		for(int x : seven) {
			if(x != 0) {
				System.out.println(x);
			}
		}
	}

}