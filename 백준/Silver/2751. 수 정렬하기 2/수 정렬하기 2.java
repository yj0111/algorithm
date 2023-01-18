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
		
		int N = Integer.parseInt(br.readLine());
		
		//배열에 저장
		ArrayList<Integer> list = new ArrayList<>();
		
		//N번 
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		//정렬
		Collections.sort(list);
		
		for(int x : list) {
			bw.write(String.valueOf(x) +"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}

}