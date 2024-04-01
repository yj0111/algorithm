import java.util.*;
import java.io.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] map = new char[m][n];
        for(int i=0;i<m;i++){
            map[i] = board[m-i-1].toCharArray();
        }

        while(true){
            boolean flag=true;
            boolean[][] check =new boolean[m][n];

            //체크
            for(int i=0;i<m-1;i++){
                for(int j=0;j<n-1;j++){
                    if(map[i][j]=='x'){
                        continue;
                    }
                    char a = map[i][j];
                    if(map[i][j+1] == a && map[i+1][j] == a && map[i+1][j+1] == a){
                        check[i][j] = check[i][j+1] = check[i+1][j] = check[i+1][j+1] = true;
                        flag=false;
                    }
                }
            }

            if(flag){
                break;
            }

            //블록 지우기
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(check[i][j]){
                        map[i][j] = 'x';
                        answer++;
                    }
                }
            }
            
            //블록 내리기
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(map[i][j]=='x'){
                        for(int k=i;k<m;k++){
                            if(map[k][j]=='x'){
                                continue;
                            }
                            map[i][j]=map[k][j];
                            map[k][j]='x';
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
