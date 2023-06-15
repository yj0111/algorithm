import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        //정답을 담을 배열
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            //하나씩 잘라서 확인
            int[] list = new int[commands[i][1]-commands[i][0]+1];
            int idx = 0;
            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
                list[idx++] = array[j];
            }
            //정렬
            Arrays.sort(list);
            
            //x번째 수들 정답배열에 담기 
            answer[i] = list[commands[i][2]-1];
            
            //확인용
            //System.out.println(Arrays.toString(answer));
        }
        return answer;
    }
}