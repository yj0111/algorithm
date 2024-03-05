import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int size = strings.length;
        String[] answer = new String[size];
        
        List<String> word = new ArrayList<>();
        
        for(int i = 0; i<size; i++){
            word.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(word);
        
        for(int i = 0; i< word.size(); i++){
            answer[i] = word.get(i).substring(1);
        }
        
        return answer;
    }
}