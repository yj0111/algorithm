import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		    for(int t = 1; t <= T; t++) {
		    	
		    	String text = sc.next();
		        
		    	int[] memory = new int[text.length()];
		        
		        for(int i = 0; i < text.length(); i++) {
		        	
		        	//System.out.println(Arrays.toString(memory));
		        	
		        	memory[i] = text.charAt(i) - '0';
		        	
		        }
		        
		            int cnt = memory[0];
		
		     for(int i = 1; i < memory.length; i++) {
		          
		    	 if(memory[i] != memory[i-1])
		                    cnt++;
		      }

		     System.out.println("#" + t + " " + cnt);
		    }
	}
	
}