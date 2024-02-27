import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s, int n) {
        char[] big = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] small = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        StringBuilder result = new StringBuilder(); 

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) { //소문자
                int index = -1;
                for (int j = 0; j < 26; j++) {
                    if (c == small[j]) {
                        index = j;
                        break;
                    }
                }
                if (index >= 0) {
                    int resultNum = (index + n) % 26;
                    result.append(small[resultNum]);
                } else {
                    result.append(c); 
                }
            } else if (Character.isUpperCase(c)) {
                int index = -1;
                for (int j = 0; j < 26; j++) {
                    if (c == big[j]) {
                        index = j;
                        break;
                    }
                }
                if (index >= 0) {
                    int resultNum = (index + n) % 26;
                    result.append(big[resultNum]);
                } else {
                    result.append(c);
                }
            } else {
                result.append(c); 
            }
        }
        
        return result.toString();
    }
}
