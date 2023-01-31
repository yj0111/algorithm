import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//롤케이크 길이
		int L = sc.nextInt();
		//롤케이크 배열
		int[] roll = new int[L+1];
		
		//방청객의 수 
		int N = sc.nextInt();
		//젤 마니 받을거라고 기대한 개수 
		int nMax = 0;
		int rdCake = 0;
		
		//방청객들이 적어 낸 수 P, K 
		for(int i = 1; i<=N; i++) {
			int p = sc.nextInt();
			int k = sc.nextInt();
			
			//롤케이크 배열에 담기
			for(int j = p; j<=k; j++) {
				if(roll[j] == 0) {
					roll[j] = i;
				}else {
					j++;
				}
			}
			
			//기대한 케이크 .. 
			for(int j = p; j<=k; j++) {
				if(nMax < k-p+1) {
					nMax = k-p+1;
					rdCake = i;
					break;
				}
			}
		}
		
		//기대한 사람
		System.out.println(rdCake);
		
		//누가 많이 받았나 count 배열에 담기 
		int[] count = new int[N+1];
		
		for(int i = 0; i<roll.length; i++) {
			count[roll[i]]++;  
		}
		
		
		//젤 마니 받은 사람 찾기 
		int max = 0;
		for(int i = 1; i<count.length; i++) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		
		int MaxCake = 0;
		//max 값 찾기
		for(int i = 1; i<count.length; i++) {
			if(max == count[i]) {
				MaxCake = i;
				break;
			}			
		}
		
		//실제로 제일 많이 받은 사람
		System.out.println(MaxCake);
		
	}
}