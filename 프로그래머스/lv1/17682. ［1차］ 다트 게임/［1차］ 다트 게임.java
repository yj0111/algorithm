import java.io.*;
import java.util.*;

class Solution {
    public int solution(String dartResult) {
        // 점수 저장
		int[] score = new int[3];
		int idx = 0;

		// 최종 점수
		int answer = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			// 하나씩 잘라서 비교
			char c = dartResult.charAt(i);
			// char타입이 숫자인지 확인하는거래.. isDigit
			if (Character.isDigit(c)) {
				if (c == '1' && dartResult.charAt(i + 1) == '0') {// 10이면
					score[idx++] = Integer.parseInt(dartResult.substring(i, i + 2));
					i++;
				} else {
					score[idx++] = c - '0';
				}
			} else {
				switch (c) {
				case 'S': //1제곱
					score[idx - 1] = (int) Math.pow(score[idx - 1], 1);
					break;
				case 'D': //2제곱
					score[idx - 1] = (int) Math.pow(score[idx - 1], 2);
					break;
				case 'T': //3제곱
					score[idx - 1] = (int) Math.pow(score[idx - 1], 3);
					break;
				case '*':
					if (idx == 1) {
						score[idx - 1] *= 2;
					} else {
						score[idx - 1] *= 2;
						score[idx - 2] *= 2;
					}
					break;
				case '#':
					score[idx - 1] *= -1;
				}
			}

			// 점수 어떻게 저장되는지 확인용
			//System.out.println(Arrays.toString(score));

		}
		for (int j = 0; j < score.length; j++) {
			answer += score[j];
		}
		System.out.println(answer);
        
        return answer;
    }
}
