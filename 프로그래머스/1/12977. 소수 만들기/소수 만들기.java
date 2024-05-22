import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int length = nums.length;
        
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        //세개 더해서 가장 큰거 
        int max = nums[length-1] + nums[length-2] + nums[length-3];
        
        for (int i = 2 ; i <= max ; i++) {
           int l = 0;

           for ( ; l < list.size() && l <= (int)Math.sqrt(i) ; l++) {
                if(i%list.get(l) == 0) {
                    break;
                }
           }
            
           if (l == list.size() || l == (int)Math.sqrt(i)+1) {
                list.add(i);
           }
        }
        
        // System.out.println(list.toString());
        
        for (int i = 0 ; i < length-2 ; i++) {
           for (int j = i+1 ; j < length-1 ; j++) {
               for (int k = j+1 ; k < length ; k++) {
                   int target = nums[i] + nums[j] + nums[k];
                   if (list.contains((Integer)target)) {
                       answer++;
                   }
               }
           } 
        }

        return answer;
    }
}