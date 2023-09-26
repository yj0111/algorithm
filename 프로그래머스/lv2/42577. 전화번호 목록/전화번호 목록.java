import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true; 
    }
}

/* 틀린 이유 (1) contains
    if (phone_book[i + 1].contains(phone_book[i])) 
    contains 로 해서 13번 테스트 케이스만 틀렸는데 
    문제 조건이 "접두사"인 경우만 이라서 contains 쓰면 안됨 ! 
    -> startswith로 다시 해봄
    
    틀린이유 (2) startsWith
    -> 모든 테스트 케이스 런타임 에러 
*/