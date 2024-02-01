class Solution {
    public int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        return Integer.parseInt(str, 3);// 3진수인 str를 10진수로
    }
}
