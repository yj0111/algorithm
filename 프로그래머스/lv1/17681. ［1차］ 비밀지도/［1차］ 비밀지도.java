import java.util.*;

class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
//         System.out.println(n);
//         System.out.println(Arrays.toString(arr1));
//         System.out.println(Arrays.toString(arr2));

		// 지도1번
		for (int i = 0; i < n; i++) {
			String str1 = Integer.toBinaryString(arr1[i]);
			str1 = String.format("%" + n + "s", str1);
			str1 = str1.replaceAll("1", "#");
			str1 = str1.replaceAll("0", " ");
			System.out.println(str1);
		}

		System.out.println("지도 2=======================================");
		// 지도2번
		for (int i = 0; i < n; i++) {
			String str2 = Integer.toBinaryString(arr2[i]);
			str2 = String.format("%" + n + "s", str2);
			str2 = str2.replaceAll("1", "#");
			str2 = str2.replaceAll("0", " ");
			System.out.println(str2);
		}
		String[] answer = new String[n];
		
		//비트 연산으로 지도 1 번 2번 겹치기! 
		for (int i = 0; i < n; i++) {
			String str = Integer.toBinaryString(arr1[i] | arr2[i]);
			//길이 n으로 해주고 공백 빈칸으로 넣어주기 
			str = String.format("%" + n + "s", str);
			//1은 #로 0은 공백으로 바꿔주기
			str = str.replaceAll("1", "#");
			str = str.replaceAll("0", " ");
			answer[i] = str;
		}
		return answer;
	}
}
