import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException  {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //올라가
		int a = Integer.parseInt(st.nextToken());
		//내려가
		int b = Integer.parseInt(st.nextToken());
		//총길이
		int c = Integer.parseInt(st.nextToken());
 
		//얼마나 걸리냐 ? 
		int day = (c - b) / (a - b);
		
		//쪼금 남은 경우 
		if ((c - b) % (a - b) != 0) {
			day++;			
		}
 
		System.out.println(day);

	}
}