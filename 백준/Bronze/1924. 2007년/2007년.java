import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    
		//달
		int m = Integer.parseInt(st.nextToken());
	    //일
		int d = Integer.parseInt(st.nextToken());
	    
		String[] list = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
	    
		//2007년 
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	    
		int n = 0;
	    for (int i = 0; i < m; i++) {
	        n += months[i];
	    }
	    	n += d-1;
	    
	    System.out.print(list[n%7]);
}


}