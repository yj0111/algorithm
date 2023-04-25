import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> company = new TreeSet<>();
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String name = sc.next();
			String status = sc.next();
			
			if(status.equals("enter")) {
				company.add(name);
			}else if(status.equals("leave")) {
				company.remove(name);
			}
		}
		Iterator<String> iter = ((TreeSet<String>) company).descendingIterator();
		while(iter.hasNext()) {
		    System.out.println(iter.next());
		}
	}
}