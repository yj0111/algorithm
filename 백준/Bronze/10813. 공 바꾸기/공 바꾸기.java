import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        
		int [] bag = new int[n+1];
        
		for(int i=1;i<=n;i++)
			bag[i]=i;
		
        for(int i=0;i<m;i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			int temp=bag[a];
			bag[a]=bag[b];
			bag[b]=temp;
		}
		
        for(int i=1;i<=n;i++)
			System.out.print(bag[i]+ " ");
	}
}