import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
            if (i % 10 == 9) {
            	System.out.println();
            }
        }
    }
}