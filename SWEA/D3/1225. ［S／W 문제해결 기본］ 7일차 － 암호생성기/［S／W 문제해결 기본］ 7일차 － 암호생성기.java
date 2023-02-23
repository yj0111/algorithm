import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(sc.hasNextInt()) {
		
			int T = sc.nextInt();
			
			//암호 넣는곳 
			Queue<Integer> queue = new LinkedList<>();
			
			for(int i = 0; i<8; i++) {
				queue.add(sc.nextInt());
			}
			
			//맨 앞꺼 뺀거
			int num = 1;
			
            while (num!=0) {
            	//하나씩 빼기 1~5까지만
                for (int i = 1; i < 6; i++) {
                	num = queue.poll();
                    num -= i;
                    
                    //만약에 뺀 수가 0보다 작아지면 
                    if (num <= 0) {
                        num = 0;
                    }
                    // 맨뒤에 0 추가 하기 !
                    
                    queue.offer(num);
                    if(num==0) break;
                }
            }
			
			//System.out.println(queue);
			
			
			//출력하기 
			System.out.print("#"+T);
			while(!(queue.isEmpty())) {
				System.out.print(" "+queue.poll());
			}System.out.println();
			
		}
		
		
	}

}