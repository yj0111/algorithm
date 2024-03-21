public class Solution {
    static int answer;
    static boolean[] visited;
 
    public static int solution(int k, int[][] dungeons) {
        int depth = 0;
        visited = new boolean[dungeons.length];
 
        dfs(depth, k, dungeons);
 
        return answer;
    }
 
    private static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}