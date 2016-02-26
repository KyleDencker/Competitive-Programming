import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String a = stdin.readLine();
		String b = stdin.readLine();
		// remove leading zeros.
		int start = 0;
		while (a.length() != start && a.charAt(start) == '0') {
			start++;
		}
		a = a.substring(start);
		start = 0;
		while (b.length() != start && b.charAt(start) == '0') {
			start++;
		}
		b = b.substring(start);
		if (a.length() > b.length()) {
			out.println(">");
		} else if (a.length() < b.length()) {
			out.println("<");
		} else {
			int ans = a.compareTo(b);
			if (ans < 0) {
				out.println("<");
			} else if (ans > 0) {
				out.println(">");
			} else {
				out.println("=");
			}
		}

		out.flush();
		out.close();

	}

}
