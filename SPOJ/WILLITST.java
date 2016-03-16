// Brett Fazio
// SPOJ Problem WILLITST

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WILLITST {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(bu.readLine());
		
		ArrayList<Long> passed = new ArrayList<>();
		
		boolean broke = false;
		
		while (n > 1) {
			if (n%2==0) {
				n = (long)Math.floor(n/2);
			}else {
				n = 3*n+3;
			}
			if (passed.contains(n)) {
				broke = true;
				break;
			}
			passed.add(n);
		}
		
		if (broke) {
			System.out.println("NIE");
		}else {
			System.out.println("TAK");
		}

	}

}
