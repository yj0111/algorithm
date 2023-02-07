import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//가로
		int x = sc.nextInt();
		//세로
		int y = sc.nextInt();
		//몇번 짤라? 
		int n = sc.nextInt();
		
		
		//자르는 번호 담기
		List<Integer> x_list = new ArrayList<Integer>();
		List<Integer> y_list = new ArrayList<Integer>();

		
		//가로 최대 
		int max_x = 0;
		//세로 최대
		int max_y = 0;
		
		//일단 맨 끝은 항상 더하기
		x_list.add(0);
		x_list.add(x);
		y_list.add(0);
		y_list.add(y);
		
		for(int i = 0; i<n; i++) {
			int d = sc.nextInt();
			int num = sc.nextInt();
			
			if(d == 0) {
				y_list.add(num);
			}else if(d == 1) {
				x_list.add(num);
			}
			
		}
		
		//정렬하기
		x_list.sort(null);
		y_list.sort(null);
//		System.out.println(x_list);
//		System.out.println(y_list);
		
		
		
		for(int j = x_list.size()-1; j>0; j--) {
				if(max_x < x_list.get(j) - x_list.get(j-1)) {
					max_x = x_list.get(j) - x_list.get(j-1);
				}
		}
		
		for(int j = y_list.size()-1; j>0; j--) {
			if(max_y < y_list.get(j) - y_list.get(j-1)) {
				max_y = y_list.get(j) - y_list.get(j-1);
			}
		}
		
//		System.out.println(max_x);
//		System.out.println(max_y);
			
		int sum = (max_x * max_y);
		
		System.out.println(sum);

		
	}

}