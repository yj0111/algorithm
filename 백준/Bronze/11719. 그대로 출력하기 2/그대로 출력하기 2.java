import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext())
		{
			String input = sc.nextLine();
			sb.append(input+"\n");
		}
		System.out.print(sb);
	}
}