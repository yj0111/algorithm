import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String input = br.readLine();
            if(input.length() == 1 && input.charAt(0) == '0') {
                return;
            }
            int width = 0;
            if(input.length() == 4) {    // 좌 우 여백 + 숫자사이 간격 값을 먼저 구함 
                width = 5;
            }else if(input.length() == 3) {
                width = 4;
            }else if(input.length() == 2) {
                width = 3;
            }else {
                width = 2;
            }
            
            for(int i = 0; i < input.length(); i++) {    // 한 숫자씩 돌아가면서 숫자에 맞는 너비를 추가해줌 
                switch(input.charAt(i)) {
                case '1': width += 2; break;
                case '0': width += 4; break;
                default: width += 3; break;
                }
            }
            System.out.println(width);
        }
    }
}