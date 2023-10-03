import java.io.*;
import java.util.*;

class Solution{
    public int solution(String s){
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();                
            }else{
                stack.push(ch);
            }
        }
        
        if(stack.isEmpty()){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}