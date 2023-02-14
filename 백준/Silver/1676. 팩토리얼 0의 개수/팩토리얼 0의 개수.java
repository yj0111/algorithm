import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//팩토리얼에서 뒤에 0 이  생기는게 .. 2*5 때문이였다..!
		//5로 나눌수있는 개수 구하면 된당
		int N = Integer.parseInt(br.readLine());
		
		//0의 개수
		int z_count = 0;
 
			while (N >= 5) {
				z_count += N / 5;
				N = N/5;
			}
			
		System.out.println(z_count);
	}
		
}