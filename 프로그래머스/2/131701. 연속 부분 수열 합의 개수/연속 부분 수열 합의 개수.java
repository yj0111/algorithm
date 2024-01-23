import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int length = elements.length; //기존의 배열 길이
        
        //배열 2배로 뒤에 늘리기
        int[] newElements = new int[length * 2 ];
        
        for(int i = 0; i<length; i++){
            newElements[i] = newElements[i+length] = elements[i];
        }
        
        // System.out.println(Arrays.toString(newElements));
        
        Set<Integer> set = new HashSet<>();
        
        
        for(int i = 1; i<=length; i++){
            for(int j = 0; j<length; j++){
                set.add(Arrays.stream(newElements, j, j+i).sum());
            }
        }
        
        // System.out.println(set);
    
        return set.size();
    }
}