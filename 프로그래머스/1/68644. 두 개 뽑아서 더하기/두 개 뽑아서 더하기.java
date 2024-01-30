import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
       Set<Integer> set = new HashSet<>();
        
       for(int i = 0; i<numbers.length; i++){
            int a = numbers[i];
            for(int j = 0; j<numbers.length; j++){
                if(i != j){
                    set.add(a+numbers[j]);
                }
            }
        }
        int[] answer = new int[set.size()];
        
        int index = 0;
        for(Integer num : set){
            answer[index] = num;
            index++;
        }
        Arrays.sort(answer);
        return answer;
    }
}