import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//총 몇 라운드
		int N = sc.nextInt();
		
		for(int tc = 0 ; tc<N; tc++) {
			//a 딱지 그림 총 개수
			int a = sc.nextInt();
			
			int[] a_list = new int[5];
			
			for(int i = 0; i<a ; i++) {
				a_list[sc.nextInt()]++;
			}
			
			int b = sc.nextInt();
	
			int[] b_list = new int[5];
			for(int i = 0; i<b; i++) {
				b_list[sc.nextInt()]++;
			}
			
//			System.out.println(Arrays.toString(a_list));
//			System.out.println(Arrays.toString(b_list));
			
			//별이 더 많으면
			if(a_list[4] > b_list[4]) {
				System.out.println("A");
			}else if(a_list[4] == b_list[4]) {
				if(a_list[3] > b_list[3]) {
					System.out.println("A");
				}else if(a_list[3] == b_list[3]) {
					if(a_list[2] > b_list[2]) {
						System.out.println("A");
					}else if (a_list[2] == b_list[2]) {
						if(a_list[1] > b_list[1]) {
							System.out.println("A");
						}else if(a_list[1] == b_list[1]) {
							System.out.println("D");
						}else {
							System.out.println("B");
						}
					}else {
						System.out.println("B");
					}
				}else {
					System.out.println("B");
				}
			}else {
				System.out.println("B");
			}
			
			
		}
	}
}