class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        for(int i = 0; i< num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        System.out.println(sum+","+mul);
        int answer = 0;
        if(mul > (sum*sum)){
            answer = 0;
        }else{
            answer = 1;
        }

        return answer;
    }
}