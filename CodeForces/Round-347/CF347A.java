import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class CF347A {

	public static void main(String[] args) throws IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(System.out);
		
		String[] ins = bu.readLine().split(" ");
		
		BigInteger a = new BigInteger(ins[0]);
		BigInteger b = new BigInteger(ins[1]);
		
		// If they are the same, print the number
		if (a.compareTo(b) == 0) {
			out.println(a);
		}else {
		  // If they are not the same, the GCD will always be 1, (What is the GCD of any number and that number plus one?)
			out.println(1);
		}
		out.close();

	}

}
