class Solution {
    public String solution(int[] food) {
        String answer = "";        
        for(int i = 0; i< food.length; i++){
            for(int j = 0; j<food[i]/2; j++){
                answer += i;
            }          
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        String reverse = sb.reverse().toString();
        String answer2 = answer +"0" + sb;
        System.out.println(answer2);
        
        return answer2;
    }
}