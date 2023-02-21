import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//몇번 테스트
		int N = sc.nextInt();
		for(int i = 0; i<N; i++) {
			count = 0;
		String text = sc.next();
		char[] ch = text.toCharArray();
		System.out.println(isPalindrome(ch)+" "+ ""+count);
		}
	}
	
	static int recursion(char[] ch , int l, int r){
	    count();
		if(l >= r) return 1;
	    else if(ch[l] != ch[r]) return 0;
	    else return recursion(ch, l+1, r-1);
	}
	
	//몇번 호출했는지 카운트
	static int count;
	static void count() {
		count++;
	}

	static int isPalindrome(char[] ch){
	    return recursion(ch, 0, ch.length-1);
	}
	
}