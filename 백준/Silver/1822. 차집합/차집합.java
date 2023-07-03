import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arrA = new int[a];
        int[] arrB = new int[b];

        TreeSet<Integer> aSet = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (aSet.contains(k))
                aSet.remove(k);
        }

        System.out.println(aSet.size());
        for (int x : aSet) {
            System.out.print(x + " ");
        }
    }
}