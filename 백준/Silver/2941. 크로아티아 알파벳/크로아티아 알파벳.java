import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력받는 문자 
		String text = sc.next();
		
		//몇개인지 출력!
		int count = 0;
		
		//크로아티아 문자 
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		//크로아티아 문자를 포함하고 있으면 X로 바꿔주기 ! 
		for(String cro : croatia) {
			 while(text.contains(cro)) {
				 text = text.replace(cro, "X");
			 }
		 }
		 
		//출력) 크로아티아 글자를 X로 바꾼 text의 길이 
		 System.out.println(text.length());
	}
}