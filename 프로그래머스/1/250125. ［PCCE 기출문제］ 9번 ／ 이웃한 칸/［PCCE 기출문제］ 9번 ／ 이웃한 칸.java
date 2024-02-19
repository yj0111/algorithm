import java.io.*;
import java.util.*;

class Solution {
    static int dh[] = {0,1,-1,0};
    static int dw[] = {1,0,0,-1};
    
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        for(int i = 0; i<4; i++){
                int nh = h + dh[i];
                int nw = w + dw[i];
             if(nh >= 0 && nh < n && nw >=0 && nw <n){  
                if(board[h][w].equals(board[nh][nw])){
                    count++;
                }
            }
        }
        return count;
    }
}