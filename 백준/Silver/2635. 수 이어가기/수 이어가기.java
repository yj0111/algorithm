import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int max = 0;
		int max_num = 0;
		for(int j = 1; j<=N; j++) {
			list.add(N);
			list.add(j);
			for(int i = 0; i<=N; i++) {
				if(list.get(i)- list.get(i+1) < 0) {
					break;
				}else {
					list.add(list.get(i)- list.get(i+1));
				}
			}
			
			if(max < list.size()) {
				max = list.size();
				max_num = j;
			}
	
			//System.out.println(list);
			list.clear();
		}
		
		System.out.println(max);
		
		list.add(N);
		list.add(max_num);
		
		for(int i = 0; i<=N; i++) {
			if(list.get(i)- list.get(i+1) < 0) {
				break;
			}else {
				list.add(list.get(i)- list.get(i+1));
			}
		}
		
		for(int x : list) {
			System.out.print(x+" ");
		}

	}
}