import java.math.BigInteger;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int check = N%2;
		BigInteger big = BigInteger.ONE;
		if(check==0) {
			for(long i=1;i<=N/2;i++) {
				big = big.multiply(BigInteger.valueOf(i*(N-i+1)));
			}
		}else {
			for(long i=1;i<=N/2;i++) {
				big = big.multiply(BigInteger.valueOf(i*(N-i+1)));
			}
			big = big.multiply(BigInteger.valueOf(N/2+1));
		}
		bw.write(String.valueOf(big));
		br.close();
		bw.close();
    }

}