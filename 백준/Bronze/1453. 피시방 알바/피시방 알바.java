import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean[] check = new boolean[101];
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int cnt = 0;
		for(int i=0;i<size;i++) {
			int tmp = sc.nextInt();
			if(check[tmp]==true){
                cnt++;
            }else{
                check[tmp] = true;
            }
		}
		System.out.println(cnt);
	}
}