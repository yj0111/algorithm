import java.io.*;
import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i = 0; i < skill_trees.length; i++) {
			String skill_name = skill_trees[i].replaceAll("[^" + skill + "]", "");
            
			for (int j = 0; j < skill.length() + 1; j++) {
				String skill_cut = skill.substring(0, j); 
				if (skill_name.equals(skill_cut)) {
					answer++;
					break;
				}
			}
        }
        
        return answer;
    }
}