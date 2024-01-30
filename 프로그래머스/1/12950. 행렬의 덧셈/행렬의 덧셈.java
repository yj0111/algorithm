class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int out = arr1.length;
        int in = arr1[0].length;
        
        int[][] answer = new int[out][in];
        
        for(int i = 0; i<out; i++){
            for(int j = 0; j<in; j++){
                answer[i][j] = (arr1[i][j] + arr2[i][j]);
            }
        }
        return answer;
    }
}