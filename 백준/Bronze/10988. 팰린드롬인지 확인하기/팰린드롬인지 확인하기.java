import java.util.*;
 
class Main {
  public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      int mid=(a.length()/2);
      int result=1;
      for(int i=0;i<mid;i++) {
          if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
              result=0;
          }         
      }
      
      System.out.println(result);
      }
}