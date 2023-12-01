import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][4];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = st.nextToken();
			arr[i][3] = st.nextToken();
		}
		
		//정렬
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[3].equals(o2[3])) {
					if(o1[2].equals(o2[2])) {
						return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
					}
					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
				}
				return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
			}
		});
		System.out.println(arr[n - 1][0] + "\n" + arr[0][0]);
	}
}