import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }
            //k번째 약수이면 i 출력
            if (k == 0) {
                System.out.print(i);
                return;
            }
        }
        //k번째 약수가 없으면 0 출력
        System.out.print(0);
    }
}