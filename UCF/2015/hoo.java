import java.util.ArrayList;
import java.util.Scanner;

public class hoo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		for(int runs = 0; runs < tests; runs++) {
			int a = s.nextInt();
			ArrayList<Integer> factors = findFac(a);
			int seq = 0;
			while(a != 1) {
				int count = 0;
				while(a%factors.get(count) != 0 && count < factors.size()) count++;
				a /= factors.get(count);
				seq++;
			}
			if(seq <= 3) {
				System.out.printf("Pop #%d: %d licks? Your goose is cooked!\n", (runs+1), seq);
			} else {
				System.out.printf("Pop #%d: A-one... A-two-HOO... A-%d.\n", (runs+1), seq);
			}
			
		}
	}
	
	static ArrayList<Integer> findFac(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				factors.add(i);
				factors.add(n/i);
			}
		}
		return factors;
	}
}
