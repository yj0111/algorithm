import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String s) {
        char[] ch = s.toCharArray();
        
        int[] answer = new int[ch.length];
        answer[0] = -1;
        
        for(int i = 0; i<ch.length; i++){
            int num = -1;
            for(int j = 0; j<i; j++){
                if(ch[i] == ch[j]){
                    num = i-j;
                }
                answer[i] = num;
            }
        }

        return answer;
    }
}