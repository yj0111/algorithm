import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        //System.out.println(Arrays.toString(citations));
        
        //결과
        int answer = 0;
        
        for(int i = 0; i<citations.length; i++){            
            int H_Index = Math.min(citations[i], citations.length - i);
                answer = Math.max(answer, H_Index);
            }
        return answer;
    }
}