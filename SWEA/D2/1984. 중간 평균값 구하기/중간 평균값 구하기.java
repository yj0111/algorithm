import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int list[] = new int[10];
		int sum = 0;
		for(int i = 0; i<T; i++) {
			sum = 0;
			for(int j = 0; j<10; j++) {
				list[j] = sc.nextInt();
			}
			
			for(int k = 0; k<list.length-1; k++) {
				for(int j = 0; j<list.length-1-k; j++) {
					if(list[j] > list[j+1]) {
						int temp = list[j];
						list[j] = list[j+1];
						list[j+1] = temp;
					}
				}
			}
			
			for(int m = 1; m<list.length-1; m++) {
				sum += list[m];	
			}
			
			double avg = (sum / 8.0);
			System.out.println("#" +(i+1)+ " "+Math.round(avg));
		}
	}
}