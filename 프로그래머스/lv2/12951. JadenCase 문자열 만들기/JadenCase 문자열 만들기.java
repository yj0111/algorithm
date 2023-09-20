import java.util.*;
class Solution {
    public String solution(String s) {
        //다 소문자로 바꾸기
        s = s.toLowerCase(); 
		StringTokenizer st = new StringTokenizer(s," ",true);
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			if (word.equals(" "))
				sb.append(word);
			else { 
				sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
			}
		}
		return sb.toString();
	}

}