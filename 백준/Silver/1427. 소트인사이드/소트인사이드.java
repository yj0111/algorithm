import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//N입력
		String N = br.readLine();
		//int N = Integer.parseInt(br.readLine());
		
		//배열에 저장
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0; i<N.length(); i++) {
			list.add(Integer.parseInt((N.substring(i, i+1))));
		}
		//정렬
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int x : list) {
			bw.write(String.valueOf(x));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}