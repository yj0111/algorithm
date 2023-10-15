import java.util.*;

public class Solution {
    public static String solution(String X, String Y) {
        HashMap<Integer, Integer> xmap = new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();
        
        for(String data : X.split("")){
            int cur = Integer.parseInt(data);
            xmap.put(cur, xmap.getOrDefault(cur, 0) + 1);
        }

        for(String data : Y.split("")){
            int cur = Integer.parseInt(data);
            ymap.put(cur, ymap.getOrDefault(cur, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 9; i >= 0 ; i --){
            if(xmap.containsKey(i) && ymap.containsKey(i)){
                int cnt = Math.min(xmap.get(i), ymap.get(i));
                for (int j = 0; j < cnt; j++) {
                    sb.append(i);
                }
            }
        }

        if(sb.toString().startsWith("0")){
            return "0";
        }
        else if(sb.toString().equals("")){
            return "-1";
        }

        return sb.toString();
    }
}