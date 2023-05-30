import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            int sum = 0;
            StringBuilder sb = new StringBuilder(); 

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sb.append(i + " + ");
                    sum += i;
                }
            }

            if (n == sum) {
                System.out.println(n + " = " + sb.toString().substring(0, sb.length() - 3));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}