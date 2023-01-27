import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            String text = sc.nextLine();
            int count = 0;
            //#이 나오면 멈추기 !
            if(text.equals("#")) {
                break;
            }
            //전체 소문자로 변경
            text = text.toLowerCase();
            
            for(int i=0; i<text.length(); i++) {
               switch(text.charAt(i)) {
                     case 'a': case 'e': case 'i':
                     case 'o':case 'u':
                        count++;
                  default: break;
               }
            }            
            System.out.println(count);
        }
    }
}