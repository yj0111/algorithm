import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String strArr[] = str.split(" ");

			System.out.print("Case #" + (i + 1) + ": ");
			for (int j = strArr.length - 1; j >= 0; j--) {
				System.out.print(strArr[j] + " ");
			}
			
			System.out.println();
		}
	}
}