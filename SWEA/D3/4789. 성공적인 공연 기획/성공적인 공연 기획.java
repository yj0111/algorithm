import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0 ; t<T; t++) {
			//텍스트 입력받기 
			String text = sc.next();
			//char배열에 넣기 ! 
			char[] people = text.toCharArray();
		
			//고용해야하는 사람 수 
			int hire = 0;
			
			//지금 박수 치는 사람 수 
			int clap = 0;
			
			for(int i = 0; i<people.length; i++) {
				//박수 치는 사람이 i 보다 작으면 
				if(clap < i && people[i] - '0' > 0) {
					//박수 치는 사람이 i 랑 같아질때까지 
					while(clap <i) {
						//고용할 사람 증가 + 박수맨 증가
						hire++;
						clap++;
					}
					clap += people[i] - '0';
				}else {
					// 박수 치는 사람에 추가
					clap += people[i] - '0';
				}
			}
			System.out.println("#"+(t+1)+" "+hire);
			
		}
	}

}