import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //학생의 수 
		
		String[] nums = new String[N]; //원본 학생 배열
		for (int i = 0; i < N; i++) {
			nums[i] = sc.next();
		}
		Set<String> students = new HashSet<>();

		int length = nums[0].length();
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j < N; j++) {
				students.add(nums[j].substring(i));
			}
			if (students.size() != N) {
				System.out.println((length-i)+1 );
				return;
			}
			students.clear();
		}
	}
}