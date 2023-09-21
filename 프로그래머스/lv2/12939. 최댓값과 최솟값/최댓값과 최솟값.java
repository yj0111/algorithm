import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer[] = s.split(" ");
        int numbers[] = new int[answer.length];
        
        for(int i = 0; i<answer.length; i++){
            numbers[i] = Integer.parseInt(answer[i]);
        }
        
        Arrays.sort(numbers);
        
        String result = "";
        result += numbers[0];
        result += " ";
        result += numbers[numbers.length-1];
        return result;
    }
}
