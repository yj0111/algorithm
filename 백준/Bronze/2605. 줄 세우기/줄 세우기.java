import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	   
	    //일단 저장 1~5 
	    int[] list = new int[N+1];
	    
	    for(int i = 1; i<= N; i++) {
	    	list[i] = sc.nextInt();
	    }

	    List<Integer> stuList = new ArrayList<>();
	    
	    //첫번째 순서는 일단 맨앞
	    stuList.add(1);
	    
	    int pass = 0;
	    for(int i = 2; i <= N; i++) {
	    	pass = list[i];
	    	
	    	if(pass == 0) { //0입력하면 그냥 뒤에 서
	    		stuList.add(i);
	    	}else if(pass > 0){
	    		stuList.add(stuList.size() - pass, i);
	    	}

	    }
	    
	    //출력하기
	    for(int x : stuList) {
	    	System.out.print(x+" ");
	    }
	    
   }
    
}