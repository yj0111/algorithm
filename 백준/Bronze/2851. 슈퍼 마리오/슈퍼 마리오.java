import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//점수 리스트
		int[] list = new int[10];
		
		for(int i = 0 ; i<10; i++) {
			list[i] = sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(list));
		
		int sum = 0;
		
		
		for(int i=0; i<10; i++) {
            sum += list[i];
         
            if(Math.abs((sum-list[i])-100) < sum-100) {
            	sum = sum-list[i];
                break;
            }
        }
		
		System.out.println(sum);

		
		
		
	}

}