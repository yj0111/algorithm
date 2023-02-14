import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 10개
        for(int i = 0; i<10; i++) {

            //덤프 횟수 (1~1000사이)
            int count = sc.nextInt();
            //가로길이 100
            int[] box = new int[100];
            
            //일단 배열에 담기
            for(int j =0; j<100; j++) {
                box[j] = sc.nextInt();
            }
            
            //덤프횟수만큼 옮기기
            for(int cnt = 0; cnt < count; cnt++) {
            	
	            //일단 박스 개수로 정렬
	            Arrays.sort(box);
	            
	            if(box[99] - box[0] == 0) {
	            	break; //젤 큰거랑 젤 작은거 차이가 1
	            }else {
		            box[99] = box[99] -1; //젤 높은거에서 하나 빼서
		            box[0] = box[0] + 1; //젤 낮은거에 붙이기
	            }
            }
            
            //박스 옮기고 나서 다시 정렬
            Arrays.sort(box);
            
            //최댓값
            int max = box[99]-box[0];
            
            System.out.println("#"+ (i+1) + " " + max);
        }
    }
}