class Solution {
       static public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
           
        for(int i=0;i<discount.length-9;i++) {
            int j = 0;
            for(j=0;j<want.length;j++) {
                int check=0;
                for(int k=i; k<i+10; k++) {
                    if(discount[k].equals(want[j])){
                      check++;  
                    } 
                }        
                if(check<number[j]) {
                     break;
                }
            }
           if(j==want.length){
             answer++;   
           }
        }
        return answer;
    }
}