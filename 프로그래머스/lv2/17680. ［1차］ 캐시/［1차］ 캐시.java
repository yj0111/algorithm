import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new ArrayList<String>();
        
        // 캐시 크기가 0이면 그냥 다 5 곱해라
        if(cacheSize == 0) {
            return cities.length * 5;
        }

        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            boolean check = false;
            for(int j = 0; j < cache.size(); j++) {
                if(city.equals(cache.get(j))) {
                    check = true;
                    cache.remove(j);
                    cache.add(city);
                    break;
                }
            }

            if(!check) {
                //캐시가 꽉차면 맨 앞 삭제하고, 새로 추가해
                if(cache.size() == cacheSize) {
                    cache.remove(0);
                }
                cache.add(city);
                answer += 5;
            } else {
                answer += 1;
            }
        }

        return answer;
    }
}
