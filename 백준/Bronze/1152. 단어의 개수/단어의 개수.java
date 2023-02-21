import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //""으로 짜르기
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //토큰 개수 
		System.out.print(st.countTokens());
	}
}