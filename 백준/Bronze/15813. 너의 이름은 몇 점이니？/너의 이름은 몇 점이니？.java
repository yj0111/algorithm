import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String str = sc.next();
        int sum = 0;
        for (int i =0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j =0; j < alpha.length; j++) {
                if (c == alpha[j]) {
                    sum += (j + 1);
                    break;
                }
            }

        }
        System.out.println(sum);
    }
}