import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String ... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean result = true;
        for(int idx= 0; idx<str.length()/2; idx++){
            if(str.charAt(idx) == str.charAt(str.length()-idx-1)){
                continue;
            }else{
                result = false;
            }
        }
        System.out.println(result);
    }
}