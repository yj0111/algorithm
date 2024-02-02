import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> type = new HashMap<>();
        
        //옷의 종류 별 개수
        for( String[] cloth : clothes ){
            
            //이미 있으면 +1
            if( type.containsKey(cloth[1]) ){
                type.put(cloth[1], type.get(cloth[1])+1);
            } else{
            	//없으면 1로 저장
                type.put(cloth[1], 1);
            }
        }
		
        for( String key : type.keySet()){
            System.out.println(key);
            answer *= type.get(key)+1;
        }
        
        //아무것도 안입은 경우 -1
        return answer-1;
    }
}