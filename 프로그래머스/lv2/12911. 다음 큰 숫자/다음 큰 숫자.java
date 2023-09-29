import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // Integer.bitCount() : 정수를 2진수로 변환한 뒤, 2진수에 포함된 1을 카운팅
        int n_cnt = Integer.bitCount(n);
        
        int b_cnt = 0;
        
        while(true){
            //조건 1 ) n보다 큰 자연수 
            n++;
            
            //조건 2 ) 2진수로 변환했을때 1의 개수 같아야함
            b_cnt = Integer.bitCount(n);

            if(n_cnt == b_cnt){
                answer = n;
                break;
            }            
        }
                
        return answer;
    }
}