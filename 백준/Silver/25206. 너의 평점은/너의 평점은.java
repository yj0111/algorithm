import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //학점 & 등급
        String what[] = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        double what_score[] = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0,0.0};

        double totalSum = 0;
        double scoreSum = 0;
        //수강 과목, 과목명, 학점, 등급
        String list[] = new String[20];
        for (int i = 0; i < 20; i++) {
            list[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(list[i], " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(what[j])) {
                    totalSum += score * what_score[j];
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);

    }
}