import java.util.Scanner;

public class Solution {
	   public static void main(String[] args) {
		   
	      Scanner sc = new Scanner(System.in);
	      
	      int T = sc.nextInt(); 
	      
	     for (int t = 1; t < T+1; t++) {
	    
		     //스도쿠
		     int [][] sudocu = new int[9][9];
		     
		     int row = 0;
			 int[] cal = new int[9];
			 int[] box = new int[9];
			 
			 int result = 0;
			 
			 for (int i = 0; i < sudocu[0].length; i++) {
		            for(int j = 0; j < sudocu.length; j++) {
		            	sudocu[i][j] = sc.nextInt();
		            	row += sudocu[i][j];
		            	
		            // i가 9 되면 가로줄 확인 
		            if(j == 8 && result != 1) {
					  if(row%45 != 0) {
					     System.out.println("#" + t + " 0");
					     result = 1;
					     break;
			                  }
			       }
			       // 세로줄
			       switch(j) {
			          case 0:
			             cal[0] += sudocu[i][j];
				     break;
			          case 1:
		   	             cal[1] += sudocu[i][j];
		   		     break;
			          case 2:
			             cal[2] += sudocu[i][j];
				     break;
			          case 3:
				     cal[3] += sudocu[i][j];
				     break;
			          case 4:
				     cal[4] += sudocu[i][j];
				     break;
			          case 5:
				     cal[5] += sudocu[i][j];
				     break;
			          case 6:
				     cal[6] += sudocu[i][j];
				     break;
			          case 7:
				     cal[7] += sudocu[i][j];
				     break;
			          case 8:
			             cal[8] += sudocu[i][j];
				     break;
			       }
			       
			       // 네모네모
			       if (i<3) {
			          if(j<3) box[0] += sudocu[i][j];
			          else if(3<=j && j<6) box[1] += sudocu[i][j];
			          else if(6<=j && j<9) box[2] += sudocu[i][j];
			       }
			       else if (3<=i && i<6) {
			          if(j<3) box[3] += sudocu[i][j];
			          else if(3<=j && j<6) box[4] += sudocu[i][j];
			          else if(6<=j && j<9) box[5] += sudocu[i][j];
			       }
			       else{
			          if(j<3) box[6] += sudocu[i][j];
			          else if(3<=j && j<6) box[7] += sudocu[i][j];
			          else if(6<=j && j<9) box[8] += sudocu[i][j];
			       }
			    }
			 }
			 
			 
			 for (int k=0; k<cal.length; k++) {
			    if (cal[k]%45 != 0 &&  result != 1) {
			       System.out.println("#" + t + " 0");
			       result = 1;
			       break;
			    }
			    if (box[k] != 45 &&  result != 1) {
			       System.out.println("#" + t + " 0");
			       result = 1;
			       break;
			    }
			 }
			 if (result == 0) {
		            System.out.println("#" + t + " 1");
			 }
		      }
	   }
	}