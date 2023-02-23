import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//몇명 
		int N = sc.nextInt();
		
		//사람들을 배열에 넣어
		String[][] people = new String[N][2];
   	 	
   	 	for(int i =  0 ; i < N ; i++) {
   	 		people[i][0] = sc.next(); //나이
   	 		people[i][1] = sc.next(); //이름
   	 	}
   	 	
   	 	//오늘배운거 !! Comparator 써보기
   	 	Arrays.sort(people, new Comparator<String[]>() {
   	 		
   	 		@Override
   	 		public int compare(String[] s1, String[] s2) {
   	 		//나이가 같으면 먼저 가입한 사람이 앞에 오는 순서
   	 		if(s1[0] == s2[0]) {
   	 			return 1;
   	 		}else {
   	 			//나이가 다르면 증가하는 순서대로 정렬
   	 			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
   	 		}
   	 	}
   	 	});
   
   	 	
   	 	//전체 출력하기
   	 	for(int i = 0; i < N; i++) {
			System.out.println(people[i][0] +" "+ people[i][1]);
   	 	}
	}
}