import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i< name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        //정답
        int[] answer = new int[photo.length];
        
        for(int i = 0; i< photo.length; i++){
            int sum = 0;
            for(int j = 0; j< photo[i].length; j++){
                if (map.get(photo[i][j]) != null) {
                sum += map.get(photo[i][j]);
                // System.out.println(map.get(photo[i][j]));
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}