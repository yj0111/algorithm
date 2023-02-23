import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//가로 
		int X = sc.nextInt();
		//세로
		int Y = sc.nextInt();
		
		//상점의 개수
		int A = sc.nextInt();
		
		//동서남북
		int[] dir = new int[A];
		//상점위치
		int[] store = new int[A];
		
		//상점을 배열에 넣어
		for(int i = 0; i<A; i++) {
			dir[i] = sc.nextInt();
			store[i] = sc.nextInt();
		}

		//동근이의 위치
		int dong_dir = sc.nextInt();
		int dong_len = sc.nextInt();
		
		//총 길이 
		int sum = 0 ;
		
		//상점 배열만큼 돌려
		for(int j = 0 ; j <A ; j++) {
			if(dir[j] == dong_dir) {
				//같을때는 그냥 길이 빼면됨 
				sum += Math.abs(store[j]-dong_len);
			}else if(dong_dir == 1) {
				if(dir[j] == 2) {
					int min1 = Math.min(store[j]+dong_len, (X-store[j])+(X-dong_len));
					sum += Y + min1;
				}else if(dir[j] == 3) {
					sum += store[j] + dong_len;
				}else if(dir[j] == 4) {
					sum += store[j] + (X-dong_len);
				}
			}else if(dong_dir == 2) {
				if(dir[j] == 1) {
					int min2 = Math.min(store[j]+dong_len, (X-store[j])+(X-dong_len));
					sum += Y + min2;
				}else if(dir[j] == 3) {
					sum += (Y-store[j]) + dong_len;
				}else if(dir[j] == 4) {
					sum += (Y-store[j]) + (X-dong_len);
				}
			}else if(dong_dir == 3) {
				if(dir[j] == 1) {
					sum += dong_len + store[j];
				}else if(dir[j] == 2) {
					sum += (Y-dong_len) + store[j];
				}else if(dir[j] == 4) {
					int min3 = Math.min(store[j]+dong_len, (Y-store[j])+(Y-dong_len));
					sum += X + min3;
				}
			}else if(dong_dir == 4) {
				if(dir[j] == 1) {
					sum += (X-store[j]) + dong_len;
				}else if(dir[j] == 2) {
					sum += (X-store[j]) + (Y-dong_len);
				}else if(dir[j] == 3) {
					int min4 = Math.min(store[j]+dong_len, (Y-store[j])+(Y-dong_len));
					sum += X + min4;
				}
			}
		}
		System.out.println(sum);
		
	}

}