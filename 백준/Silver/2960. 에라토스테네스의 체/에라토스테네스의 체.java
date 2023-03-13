import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] list = new int[N+1];
		
		//1.2부터 N까지 모든 정수를 적는다.
        for (int i = 2; i <= N; i++) {
        	list[i] = i;
        }
        
        //지워진 애들을 넣는 리스트 
        ArrayList<Integer> remove_list = new ArrayList<>();
        
//        System.out.println(Arrays.toString(list));
		
        for (int i = 2; i <= N; i++) {
        	if(list[i] == 0) continue;
        	//2.아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
        	for(int j = i; j<=N; j+=i) {
        		list[j] = 0;
//                System.out.println(Arrays.toString(list));
                if(!remove_list.contains(j)) {
                	remove_list.add(j);
                }
        	}
        }
        
//        System.out.println(remove_list);
        System.out.println(remove_list.get(K-1));
	}
}