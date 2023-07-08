import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K;
        int ys = 0;
        int ms = 0;
        for (int i = 0; i < N; i++) {
            K = sc.nextInt();
            ys += ((K / 30) + 1) * 10;
            ms += ((K / 60) + 1) * 15;
 
        }
        if (ys == ms) {
            System.out.println("Y M " + ys);
        } else if (ys < ms) {
            System.out.println("Y " + ys);
        } else if (ys > ms) {
            System.out.println("M " + ms);
        }
    }
}