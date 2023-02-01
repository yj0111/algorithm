import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//설탕 N킬로
		int N = sc.nextInt();
		
		//봉지
		int bag = 0;
		
		//최대한 적은 봉지
		//일단 5kg로 나누기
		while(true) {
			
			if(N % 5 == 0) {
				bag += N/5;
				break;
			}else { 
				// 5kg로 안나눠지면.. 3Kg로 나누기
					N = N-3;
					bag++; 
				}
			//정확하게 안나눠지면  
			if(N < 0){
					bag = -1;
					break;
				}
		}
		System.out.println(bag);
	}
}