import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sentences = str.split("(?<=\\.)|(?<=\\?)");
		StringBuilder sb = new StringBuilder();
		for (String sentence : sentences) {
			String trimmedSentence = sentence.trim();

			if (trimmedSentence.startsWith("What is") && trimmedSentence.endsWith("?")) {
				String answer = trimmedSentence.replace("What", "Forty-two").replace("?", ".");
				sb.append(answer).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}