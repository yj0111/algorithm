import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int turn = 0; // 회차
        int delete = 0; // 삭제된 0 개수

        while (!s.equals("1")) { 
            turn++; 
            
            int s_size = s.length();
            
            // 1. 0 제거
            s = s.replaceAll("0", "");

            // 2. 0 제거 후 길이
            int c = s.length();
            
            
            delete += (s_size - c); 

            // c 이진수로 변환 -> s에 저장
            s = Integer.toBinaryString(c);
        }

        int[] answer = { turn, delete };
        return answer;
    }
}
