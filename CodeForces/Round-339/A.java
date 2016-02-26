import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer tokens = new StringTokenizer(stdin.readLine());
		BigInteger l = new BigInteger(tokens.nextToken());
		BigInteger r = new BigInteger(tokens.nextToken());
		BigInteger k = new BigInteger(tokens.nextToken());
		BigInteger total = BigInteger.ONE;
		boolean before = false;
		if (l.equals(total)) {
			out.print("1");
			before = true;
		}
		while (total.compareTo(r) <= 0) {
			
			total = total.multiply(k);
			if (total.compareTo(BigInteger.ZERO) < 0) break;
			if (total.compareTo(r) > 0) break;
			if (total.compareTo(l) >= 0) {
				if (before) out.print(" ");
				out.print(total);
				before = true;
			} 
			//System.out.println(total + " " + k);
		}
		if (!before) out.println("-1");
		out.flush();
		out.close();
	}

}
