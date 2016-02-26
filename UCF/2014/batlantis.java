import java.util.Scanner;

// Brett Fazio
// Code for UCF High School Programming Tournament 2014
// Problem: Batlantis

public class batlantis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int words = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < words; i++) {
			String[] in = sc.nextLine().split(" ");
			// Split the two words that are on the same line. Set them to their own String.
			String a = in[0];
			String b = in[1];

			// The shortest possible length will be the lengths of the two words. Store them together in a variable (ss). 
			// And save their length (shortest)
			int shortest = a.length() + b.length();
			String ss = a + b;

			// These double for loops generate all possible substrings of String a, 
			// to see how these for loops work see the Wiki under Beginner Strings
			for (int c = 0; c < a.length(); c++) {
				for (int cc = 1; cc <= a.length() - c; cc++) {
					String sub = a.substring(c, c + cc);

					// If the substring we found is the end of String a and the beginning of string b
					// And (the inner if statement) its length (when removed from b as we don't need
					// it there as it is in the first string) is less than the shortest string we declared
					// at the top.
					if (a.endsWith(sub) && b.startsWith(sub) ) {
						String comb = a + (b.replace(sub, ""));
						if (comb.length() < shortest) {
							// If the new combined string is less than our lowest, change the int shortest to the
							// new lowest length and overwrite ss.
							shortest = comb.length();
							ss = comb;
						}
					}
				}
			}
			
			// Print out ss along with the entry number.
			System.out.println("Entry #" + (i+1) + ": " + ss);
		}

	}

}
