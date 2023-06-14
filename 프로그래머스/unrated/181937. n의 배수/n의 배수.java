class Solution {
    public int solution(int num, int n) {
        int answer = 1;  
        if(num % n == 0){
            answer = 1;            
        }else{
            answer = 0;
        }

        return answer;
    }
}