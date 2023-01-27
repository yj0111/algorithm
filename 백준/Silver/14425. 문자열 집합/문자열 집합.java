import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		List<String> test = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			list.add(sc.next());
		}
		
		for(int j =0; j<M; j++) {
			test.add(sc.next());
		}
		
		int count = 0;
		
		for(int k = 0; k<test.size(); k++) {
			for(int l = 0; l<list.size(); l++) {
				if(test.get(k).equals(list.get(l))) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		
	}

}