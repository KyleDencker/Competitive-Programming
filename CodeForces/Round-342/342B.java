import java.io.PrintWriter;
import java.util.Scanner;

// Brett Fazio
// CodeForces Round 342 - Problem B
// Find the number of times the substring (pine) is contained in the large String (google)

public class CF342B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

    // Scan in the two Strings
		String google = sc.nextLine();
		String pine = sc.nextLine();

		int l = 0;
		int c = 0;


    // Find all occurances of pine in google, if there is no instance of pine past
    // position l, indexOf returns -1, that is why the while loop looks for l to 
    // not be equal to -1.
		while (l != -1) {
			l = google.indexOf(pine, l);

			if(l != -1) {
				l = l + pine.length();
				c++;
			}
		}


    // Print the number of occurances.
		out.println(c);

    // When using PrintWriter you have to close it at the end of your program
    // in order for anything to be printed.
		out.close();

	}

}
