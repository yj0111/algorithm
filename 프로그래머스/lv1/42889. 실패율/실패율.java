import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] result = new double[N];//실패율 담는 배열
        double[] result2 = new double[N]; //실패율 담는 배열2
        int[] user = new int[N];
        int[] fail = new int[N]; //최종결과 배열 
        
        Arrays.sort(stages);
        
        for(int i = 0; i<N; i++){
            int count = 0;
            for(int j = 0; j<stages.length; j++){
                if(stages[j]==i+1){
                    count++;
                }
            }
            answer[i] = count; 
        }
        
        int people = stages.length;

        user[0] = stages.length;
        for(int i = 1; i<N; i++){
            user[i] = people-answer[i-1];
            people -= answer[i-1];
        }
    
        //실패율 구하기
        //0명이면 바로 0으로 저장
        for(int i = 0; i<N; i++){
            if(answer[i] == 0) {
                result[i] = result2[i] = 0;
            }else{
                result[i]= result2[i] = answer[i]/(double)user[i];
            }
        }
        //오름차순으로 정렬
        Arrays.sort(result);

        //거꾸로 돌면서 찾기 
        for(int i = N-1; i>=0; i--){
            for(int j = 0; j<N; j++){
                 if(result[i] == result2[j]){
                    fail[N-(i+1)] = (j+1);
                     result2[j] = -1;
                     break;
                 }else{
                     continue;
                 }
            } 
        }
        return fail;
    }
}