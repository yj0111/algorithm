import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> rank = new ArrayList<>();
        for(int i = 0; i<score.length; i++){
            rank.add(score[i]);
            Collections.sort(rank);
            
            if(rank.size() > k){
                rank.remove(0);
            }
            
            answer[i] = rank.get(0);
        }
        
        return answer;
    }
}