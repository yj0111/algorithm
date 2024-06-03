import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] fruits = new int[N];
        for (int i = 0; i < N; i++) {
            fruits[i] = sc.nextInt();
        }

        System.out.println(TangHuRu(fruits));
    }

    //탕후루 ~~
    private static int TangHuRu(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++) {
            if (count.containsKey(fruits[right])) {
                count.put(fruits[right], count.get(fruits[right]) + 1);
            } else {
                count.put(fruits[right], 1);
            }

            while (count.size() > 2) {
                count.put(fruits[left], count.get(fruits[left]) - 1);
                if (count.get(fruits[left]) == 0) {
                    count.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}