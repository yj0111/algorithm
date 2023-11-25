import java.util.*;

class Solution {
    static List<String> dictionary;
    static String[] alphabetArr = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int answer;
        
        dictionary = new ArrayList<>();

        dfs("");

        answer = dictionary.indexOf(word);

        return answer;
    }

    private void dfs(String str) {
        dictionary.add(str);

        if(str.length() >= alphabetArr.length) {
            return;
        }

        for (String alphabet : alphabetArr) {
            dfs(str + alphabet);
        }
    }
}