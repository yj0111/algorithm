import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        System.out.println(s);
        String answer[] = s.split(" ");
        int numbers[] = new int[answer.length];
        
        for(int i = 0; i<answer.length; i++){
            numbers[i] = Integer.parseInt(answer[i]);
        }
        
        System.out.println(Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        String result = "";
        result += numbers[0];
        result += " ";
        result += numbers[numbers.length-1];
        return result;
    }
}