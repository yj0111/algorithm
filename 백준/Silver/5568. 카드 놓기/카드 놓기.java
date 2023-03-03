import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//중복 안되는 set 쓰기 !
		Set<String> result = new HashSet<>();
		
		//카드 총 개수
		int N = sc.nextInt();
		
		String[] card = new String[N];
		
		//선택할 카드 개수
		int K = sc.nextInt();

		//카드에 적혀있는 수 적기
		for(int i = 0; i<N; i++) {
			card[i] = String.valueOf(sc.nextInt());
		}
		
		if(K==2) {
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					if(i != j) {
						result.add(card[i]+card[j]);
					}
				}
			}
		}else if(K==3) {
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					for(int k = 0; k<N; k++) {
						if(i != j && j != k && i !=k) {
							result.add(card[i]+card[j]+card[k]);
						}
					}
				}
			}
		}else if(K==4) {
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					for(int k = 0; k<N; k++) {
						for(int m = 0; m<N; m++) {
							if(i != j &&  i !=k && i!=m && j != k && j !=m && k!=m )
							result.add(card[i]+card[j]+card[k]+card[m]);
						}
						}
					}
				}
			}
		System.out.println(result.size());
		}
		
	}