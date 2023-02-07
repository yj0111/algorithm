import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//좌석 수 
		int N = sc.nextInt();
		
		String text = sc.next();
		
		List<Object> list = new ArrayList<>();
		
		//맨 왼쪽은 일단 *
		list.add("*");
		
		for(int i = 0 ; i<text.length(); i++) {
			if(text.substring(i, i+1).equals("S")) {
				list.add("S");
				list.add("*");
			}else if(text.substring(i, i+1).equals("L")) {
				list.add("L");
				list.add("L");
				list.add("*");
				i++;
			}
			//System.out.println(list);
		}
		
		int count = 0;
		int person = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals("*")) {
				count++;
			}else {
				person++;
			}
		}
		
		
		if(count > person) {
			System.out.println(person);
		}else { 
			System.out.println(count);
		}
		
	}

}