import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt_1 = 0;
        int cnt_2 = 0;
        int cnt_3 = 0;

        for (int i = 0; i < answers.length; i++) {
            // 수포자 1의 답 체크
            if (answers[i] == one[i % 5]) {
                cnt_1++;
            }

            // 수포자 2의 답 체크
            if (answers[i] == two[i % 8]) {
                cnt_2++;
            }

            // 수포자 3의 답 체크
            if (answers[i] == three[i % 10]) {
                cnt_3++;
            }
        }

        // 최대값 계산
        int max = Math.max(Math.max(cnt_1, cnt_2), cnt_3);

        List<Integer> list = new ArrayList<>();
        if (max == cnt_1) {
            list.add(1);
        }
        if (max == cnt_2) {
            list.add(2);
        }
        if (max == cnt_3) {
            list.add(3);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
