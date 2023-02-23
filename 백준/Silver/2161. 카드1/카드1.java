import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N입력
		int N = sc.nextInt();
		
		Queue<Integer> card = new LinkedList<Integer>();
		
		for(int i =1; i<=N; i++) {
			card.add(i);
		}
		//System.out.println(card);
		
		while(card.size() != 1) {
		//제일 위에 있는 카드를 바닥에 버린다.
		System.out.print(card.poll()+" ");
		
		//제일 위에 있는 카드를 제일 밑으로 옮긴다.
		card.add(card.poll());
		//System.out.println(card);
		}
		System.out.print(card.poll());
		
		
	}

}