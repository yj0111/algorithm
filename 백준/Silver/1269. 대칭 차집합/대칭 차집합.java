import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		List<Integer> A_list = new ArrayList<>();
		
		for(int i =0; i<A; i++) {
			A_list.add(sc.nextInt());
		}

		List<Integer> B_list = new ArrayList<>();
		for(int i =0; i<B; i++) {
			B_list.add(sc.nextInt());
		}
		
		Set<Integer> set = new HashSet<>();

		for(int i =0; i<A; i++) {
			set.add(A_list.get(i));
		}

		for(int i =0; i<B; i++) {
			set.add(B_list.get(i));
		}
	
		
		int a = A_list.size();
		int b = B_list.size();
		int c = set.size();
		
		System.out.println((c-a) + (c-b));
		
		
	}
}