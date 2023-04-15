import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>(); //id랑 이름 map으로 저장하기
        int len = record.length;
        int change = 0; 

        for(int i=0; i<len; i++) {
            if(record[i].charAt(0) == 'L') {
                continue;      
            }      
            else if(record[i].charAt(0) == 'C'){
                change++; //이름만 바꾼사람  
            }
            map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
        }
         
        //결과 배열
        String[] answer = new String[len - change];
        int index = 0;

        for(int i=0; i<record.length; i++) {     
        if(record[i].charAt(0) == 'E') {
            answer[index++] = map.get(record[i].split(" ")[1]) + enter();
        }else if(record[i].charAt(0) == 'L') {
            answer[index++] = map.get(record[i].split(" ")[1]) + leave();
        }
    }        
    
        return answer;
    }
    
    public static String enter(){
        return "님이 들어왔습니다.";
    }
    
    public static String leave(){
        return "님이 나갔습니다.";
    }    
    
}