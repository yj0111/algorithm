import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//long 보다 커서 BigInteger 사용하래 
		
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());

		System.out.println(A.add(B));
	
	}
}