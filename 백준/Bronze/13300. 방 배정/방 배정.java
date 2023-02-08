import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		//수학여행 참가 학생
		int N = sc.nextInt();
		
		//한 방에 배정될수있는 최대 인원 수 
		int K = sc.nextInt();

		//방 개수 
		int room = 0;
		
		//학년별 리스트
		int[][] list = new int[7][2];
		
		//성별S(0이면 여자, 1이면 남자) , 학년 Y
		for(int i = 0 ; i<N; i++) {
			int S = sc.nextInt(); //성별
			int Y = sc.nextInt(); //학년
			
			if(S == 0) {
				list[Y][0]++;
			}else {
				list[Y][1]++;
			}
		}
		
		
		for(int i=1; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j] == 0) {
					//사람이 없으면 그냥 지나가..
					continue;	
				}
				//나눠떨어지면 굿
				room += list[i][j] / K;	

				//안나눠떨어지면 방 1개씩 더 추가해..
				if(list[i][j] % K != 0) {
					room += 1;
				}
			}
		}
		System.out.println(room);
	}
	
}