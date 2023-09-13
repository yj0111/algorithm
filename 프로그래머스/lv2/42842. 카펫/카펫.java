import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        //가운데 있을라면 3보다는 커야할듯
        for (int i = 3; i < total; i++) {
            int j = total / i;
            
            if (total % i == 0 && j >= 3) {
                    int x = Math.max(i, j);
                    int y = Math.min(i, j);
                    int mid = (x - 2) * (y - 2);
                
                if (mid == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                }
            }
        }
        return answer;
    }
}