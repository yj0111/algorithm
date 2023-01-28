import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i <K; i++) {
			int num = sc.nextInt();
			if(num == 0 && list.size()>0) {
				list.remove(list.size()-1);
			}else {
				list.add(num);
			}
		}
		
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}
}