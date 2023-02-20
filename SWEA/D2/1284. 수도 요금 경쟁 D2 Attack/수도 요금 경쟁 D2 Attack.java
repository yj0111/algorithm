import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//T
		int T = sc.nextInt();
		
		for(int i = 1; i<=T ; i++) {
			//A사 1리터 P원
			int P = sc.nextInt();
			
			//B사 기본요금Q원
			int Q = sc.nextInt();
			
			//R리터 이하 요금 
			int R = sc.nextInt();
			
			//B사 1L당 요금
			int S = sc.nextInt();
			
			//종민이 사용 W
			int W = sc.nextInt();
			
			int result = 0;
			int money_B = 0;
			int money_A = (P * W);
			if(W-R <= 0) {
				money_B = Q;
			}else if(W-R > 0) {
				money_B = (Q + (W-R) * S);				
			}
			if(money_A > money_B) {
				result = money_B;
			}else {
				result = money_A;
			}
			
			System.out.println("#"+ i+ " "+result);
		}
	}

}