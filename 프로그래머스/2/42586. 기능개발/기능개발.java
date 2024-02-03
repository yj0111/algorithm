import java.util.*;
import java.io.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i=0; i<progresses.length; i++){
            //남은 일수 계산
            queue.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));
        }

        while(!queue.isEmpty()){
            int min = queue.poll();
            int count = 1;

            while(!queue.isEmpty() && queue.peek() <= min){
                queue.poll();
                count++;
            }
            
            answer.add(count);
        }

        return answer;
    }
}