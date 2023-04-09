import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        //다 대문자로 바꾸고 시작
    	str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        List<String> Alist = new ArrayList<>();
        List<String> Blist = new ArrayList<>();
        Set<String> set = new HashSet<>();//합집합

        //A집합에 넣기
        for (int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);
            if (s.matches("[A-Z]{2}")) {
                Alist.add(s);
                set.add(s);
            }
        }

        //B집합에 넣기
        for (int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);
            if (s.matches("[A-Z]{2}")) {
                Blist.add(s);
                set.add(s);
            }
        }

        // 교집합과 합집합 구하기
        int intersection = 0;
        int union = 0;
        for (String what : set) {
            //각각 몇번 나오는지 세줘
            int count1 = Collections.frequency(Alist, what);
            int count2 = Collections.frequency(Blist, what);
            //교집합
            intersection += Math.min(count1, count2);
            //합집합
            union += Math.max(count1, count2);
        }

        // 유사도 
        double result = 0;
        if (union == 0) {
            result = 1;
        } else {
            result = (double) intersection / union;
        }
        return (int) (result * 65536);
    }
}