import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26]; //영문자 갯수 26개
		
		String word = sc.next();
		
		//단어 읽기
		for(int i=0; i<word.length(); i++) {
			//대문자 범위
			if('A'<= word.charAt(i) && word.charAt(i) <= 'Z') { 
				arr[word.charAt(i) - 'A']++; //해당 인덱스 값 1 증가
			}
			
			else { //소문자 범위
				arr[word.charAt(i) - 'a']++;
			}
		}
		
		int max =-1; //최대값 저장할 변수
		char ch = '?'; //출력할 문자 변수 ch
		
		//배열 순회 반복문
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i+65);
				//대문자로 출력해야하므로 65를 더한다.
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
	}
}