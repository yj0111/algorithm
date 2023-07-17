import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i<arr.length; i++){
            if(!stack.isEmpty()){
                if(stack.peek() != arr[i]){
                    stack.push(arr[i]);
                }else{
                    continue;
                }
            }else{
                stack.push(arr[i]);
            }
        }
        
//        System.out.println(stack);

        int cnt = stack.size();
        int[] answer = new int[cnt];
        
        //cnt-1 때문에 자꾸 틀렸다 ..!! ㅠㅠ 
        for (int i = cnt - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}