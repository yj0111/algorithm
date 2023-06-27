import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr); // 오름차순 정렬
        
        long cnt = 0; // 합이 0이 되는 경우의 수
        
        // 배열을 순회하면서 합이 0이 되는 경우의 수를 계산
        for(int i = 0; i < N; i++) {
            if(arr[i] > 0) break; // 양수인 경우는 더 이상 합이 0이 될 수 없음
            int num = arr[i];
            int left = i + 1;
            int right = N - 1;
            
            while(left < right) {
                int sum = num + arr[left] + arr[right];
                
                if(sum == 0) { 
                    int l = 1; // 왼쪽 포인터의 개수
                    int r = 1; // 오른쪽 포인터의 개수
                    
                    if(arr[left] == arr[right]) { // 왼쪽과 오른쪽 포인터가 같은 경우
                        int n = right - left + 1;
                        cnt += Combination(n); // 같은 숫자 중 3개를 선택하는 조합의 개수
                        break;
                    }
                    
                    // 왼쪽 포인터가 같은 숫자를 가리키는 경우 ) l을 증가, 오른쪽 그대로
                    while(arr[left] == arr[left + 1]) {
                        l++;
                        left++;
                    }
                    
                    // 오른쪽 포인터가 같은 숫자를 가리키는 경우) r을 증가, 왼쪽 그대로
                    while(arr[right] == arr[right - 1]) {
                        r++;
                        right--;
                    }
                    
                    cnt += l * r; 
                }
                
                if(sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        System.out.println(cnt); 
    }
    
    // 조합의 개수
    public static long Combination(int n) {
        return n * (n - 1) / 2;
    }
}