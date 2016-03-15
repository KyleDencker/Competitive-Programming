import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Kyle Dencker
// Math Primes
// March 14, 2016

public class CDRSANJ {

	static ArrayList<Integer> primes = new ArrayList<Integer>();
	static int[] answers;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OUTERLOOP:
			for (int i = 2; i <= 100001; i++) {
				// try to divide it by all known primes
				for (Integer p : primes)
					if (i % p == 0)
						continue OUTERLOOP; // i is not prime

				// i is prime
				primes.add(i);
			}
		
		// removes 2
		primes.remove(0);
		
		int input = scan.nextInt();
		answers = new int[input+1];
		Arrays.fill(answers, -1);
		answers[1] = 1;
		answers[2] = 2;
		answers[input] = solve(input);
		System.out.println(answers[input]);
	}
	
	public static int solve(int input) {
		if (answers[input] != -1) return answers[input];
		if (primes.contains(input)) return 0;
		// get factor
		int a=0, b=0;
		for (int i=(int)Math.sqrt(input); i>0; i--) {
			if (input%i == 0) {
				a = i;
				b = input/i;
				break;
			}
		}
		answers[a] = solve(a);
		answers[b] = solve(b);
		
		return answers[a] + answers[b]; 
	}

}
