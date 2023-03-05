import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//집합 A의 원소 개수 
		int A = sc.nextInt();
		
		//집합 B의 원소 개수 
		int B = sc.nextInt();

		TreeSet<Integer> A_set = new TreeSet<Integer>();
		
		for(int i = 0; i <A; i++) {
			A_set.add(sc.nextInt());
		}
		
		for(int i = 0; i <B; i++) {
			int addB = sc.nextInt();
			//B가 있으면 지워버리기
			if(A_set.contains(addB)) {
				A_set.remove(addB);
			}
		}

		System.out.println(A_set.size());
		
		//설마 for문 안에 int로 해서 틀리나 ??
		for(Integer x : A_set) {
			System.out.print(x+" ");
		}
	}
}