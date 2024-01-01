import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  
        int m = Integer.parseInt(st.nextToken());  
        int k = Integer.parseInt(st.nextToken()); 
        int team = Math.min(n/2, m); 

        m -= team;
        n -= 2*team;
        int leftOver = n+m-k;  // 남은 학생 수 - 인턴을 나가야 하는 학생 수

        if (leftOver >= 0) {
            System.out.print(team);
        } else {  
            leftOver = Math.abs(leftOver);
            int minus = (int)Math.ceil((double)leftOver / 3.0);
            if (team - minus >= 0) {
                System.out.print(team-minus);
            } else {
                System.out.print(0);
            }
        }
    }
}