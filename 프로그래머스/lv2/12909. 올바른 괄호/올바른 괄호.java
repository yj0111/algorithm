import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') { // (인 경우 스택에 넣기
                stack.push(c);
            } else { // ) 인경우 
                if (stack.isEmpty()) { // 스택이 비어있으면 짝이 안맞으니까 바로 false
                    return false;
                } else { // 짝이 맞으면 버리기 
                    stack.pop();
                }
            }
        }

        return stack.isEmpty(); 
    }
}
