import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		
		//문자열 자른거 저장할 Set
		Set<String> set = new HashSet<>();
		
		//i 번째 위치에 있는 문자 
		//char 타입 -> string 하려면 Character.toString
		for(int i =0; i<text.length(); i++) {
			set.add(Character.toString(text.charAt(i)));
		}
		
		//문자열 자르기
		for(int i = 1; i<=text.length(); i++) {
			for(int j = 0; j<text.length(); j++) {
				if(j < i) {				
					set.add(text.substring(j, i));
				}
			}
		}
		System.out.println(set.size());
	}

}