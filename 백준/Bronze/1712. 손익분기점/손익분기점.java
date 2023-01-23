import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//고정비용 A 
		//가변비용 B
		//노트북 값 C 
		
		if(B >= C) {
			System.out.println(-1);
		}else {
			//순수익이 C-B 인데 A랑 같아지면 수익 0원
			int BP = A/(C-B);
			
			//그것보다 1대만 더 만들면 손익분기점 넘어용
			System.out.println(BP+1);			
		}
		
	
	
	}

}