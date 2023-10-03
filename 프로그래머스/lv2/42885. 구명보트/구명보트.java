import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        //몸무게 젤 마니 나가는 사람 + 몸무게 젤 적게 나가는 사람 
        
        int idx = 0;
        for(int i = people.length-1;  i>= idx; i--){
            if(people[i] + people[idx] <= limit){
                idx++;
                answer++;
            }else{
                answer++;
            }
        }
        return answer;
    }
}