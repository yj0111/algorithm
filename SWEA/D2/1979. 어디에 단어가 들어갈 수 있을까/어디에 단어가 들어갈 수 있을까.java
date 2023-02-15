import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //총 테스트 케이스 
        int T = sc.nextInt();
         
        for (int t = 1; t <= T; ++t) {
             
            //퍼즐 판 N x N
            int N = sc.nextInt();
            //단어 길이
            int K = sc.nextInt();
            //퍼즐판
            int[][] puzzle = new int[N][N];
             
            //퍼즐판에 입력하기
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    puzzle[i][j] = sc.nextInt();
                }
            }
             
            //길이 얼만지
            int count = 0;
             
            //단어 몇개 가능? 
            int word = 0;
             
            // 행 검사
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (puzzle[i][j] == 1) {
                        count++;
                    }else if (count >= 1 && puzzle[i][j] == 0) {
                        if(count == K) {
                            word++;
                        }
                        count = 0;
                    }
                }
                 
                if(count == K) {
                    word++;
                }
                count = 0;
            }
             
            // 열 검사
            for (int j = 0; j < N; ++j) {
                for (int i = 0; i < N; ++i) {
                    if (puzzle[i][j] == 1) {
                        count++;
                    }else if (count >= 1 && puzzle[i][j] == 0) {
                        if(count==K) {
                            word++;
                        }
                        count =0;
                    }
                }
                 
                if(count == K) word++;
                 
                count = 0;
            }
            System.out.println("#" + t + " " + word);
        }
    }
}