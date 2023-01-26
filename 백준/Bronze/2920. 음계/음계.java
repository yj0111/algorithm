import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[8];
		//숫자 8개 받기
		for(int i =0; i<list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		String result = "";
		
		//하나하나 if 문 걸어서 print 했더니 시간 초과됨 
		
		for(int i =0; i<list.length-1; i++) {
			if(list[i] == list[i+1]-1) {
				result ="ascending";
			}else if(list[i] == list[i+1]+1){
				result ="descending";
			}else {
				result ="mixed";
                break;
			}
		}
		System.out.println(result);
	}
}