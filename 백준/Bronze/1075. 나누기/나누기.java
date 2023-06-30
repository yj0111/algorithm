import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        n = n - n % 100;
        int f = Integer.parseInt(reader.readLine());
        while (true) {
            if (n % f == 0) {
                System.out.printf("%02d", n % 100);
                break;
            } else {
                n++;
            }
        }
    }
}