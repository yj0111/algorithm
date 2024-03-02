import java.util.*;
// class Solution {
//     static HashSet<Integer> hashset = new HashSet<Integer>();
//     static boolean[] visited = new boolean[7];
//     public int solution(String numbers) {
//         int answer = 0;
        
//         dfs(numbers, "", 0);
        
//         // 중복이 제거된 숫자에서 소수가 있다면 answer++
//         for (Integer num : hashset) {
//             if (isPrime(num)) {
//                 answer++;
//             }
//         }
        
//         return answer;
//     }
   
//     public static void dfs(String numbers, String s, int depth) {
//         if (depth > numbers.length()){
//             return;
//         }
        
//         for(int i = 0; i < numbers.length(); i++) {
//             if(!visited[i]) { 
//                 //방문 처리
//                 visited[i] = true;
//                 hashset.add(Integer.parseInt(s + numbers.charAt(i)));
//                 dfs(numbers, s + numbers.charAt(i), depth + 1);
//                 visited[i] = false;
//             }
//         }
//     }
                                            
//     public boolean isPrime(int num) {
//         System.out.println(num);
//         if(num == 0 || num == 1) return false;
//         // 에라토스테네스의 체
//         for(int i=2; i <= Math.sqrt(num); i++) {
//             if(num%i==0)return false;
//         }
//         return true;
//     }
// }

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }        
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

        public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }

}