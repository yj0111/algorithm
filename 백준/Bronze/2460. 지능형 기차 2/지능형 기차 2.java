import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int human = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            human -= a;
            human += b;
            if (human>max) max = human;
        }
        System.out.println(max);
    }
}