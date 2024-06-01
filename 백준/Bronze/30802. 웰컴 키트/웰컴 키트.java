import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] list = new int[6];
		
		for(int i = 0; i < 6; i++) {
			list[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int p = sc.nextInt();
		
		int count = 0;
        
		for(int i = 0; i < 6; i++) {
			count += list[i] / t;
			if(list[i] % t != 0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(n / p + " " + n % p);
	}
}