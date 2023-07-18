class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length; //삼각형 높이 
        
        for(int i = h-2; i>=0; i--){
            for (int j = 0; j <= i; j++) {
            //삼각형에서 맨 위에 있는 숫자에 , 왼쪽 /오른쪽 아래에 있는거 중에 큰 값 더해
            triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        
        return triangle[0][0];
    }
}