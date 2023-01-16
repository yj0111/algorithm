import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        int max = 0;
        int sum = 0;
        double avg = 0.0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        sc.close();

        avg = 100.0 * sum / max / N;
        System.out.println(avg);


    }
}