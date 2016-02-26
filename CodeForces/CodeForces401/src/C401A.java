import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class C401A {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		stdin.readLine();
		StringTokenizer tokens = new StringTokenizer(stdin.readLine());
		int lastOdd = -1;
		BigInteger answer = BigInteger.ZERO;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (tokens.hasMoreTokens()) {
			list.add(Integer.parseInt(tokens.nextToken()));
		}
		Collections.sort(list);
		for (int i=0; i<list.size(); i++){
			int current = list.get(list.size()-1-i);
			if (current % 2 == 0) {
				answer = answer.add(new BigInteger(current+""));
			} else {
				if (lastOdd == -1) {
					lastOdd = current;
				} else {
					answer = answer.add(new BigInteger(current+lastOdd+""));
					lastOdd = -1;
				}
			}
		}
		System.out.println(answer);
	}
}
