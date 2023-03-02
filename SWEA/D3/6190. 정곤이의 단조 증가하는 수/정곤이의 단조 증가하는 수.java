import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int tc=1;tc<=T;tc++){
            int N = Integer.parseInt(br.readLine());
            int[] list = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
                list[j] = Integer.parseInt(st.nextToken());
 
            //없으면 -1출력할라고
            int result = -1;
            for(int j=0;j<N;j++){
                for(int k=j+1;k<N;k++){
                    // 결과 값보다 큰 값만 단조 증가 수 체크하자
                    if(result<list[j]*list[k])
                        if(check(list[j]*list[k]))
                            result = list[j]*list[k];
                }
            }
            System.out.println("#"+tc+" "+result);
        }
    }
 
    // 단조 증가하는 수 확인
    private static boolean check(int n){
        int t = n%10;
        n /=10;
        while(n!=0){
            if(n%10>t) return false;
            t = n%10;
            n /=10;
        }
        return true;
    }
}