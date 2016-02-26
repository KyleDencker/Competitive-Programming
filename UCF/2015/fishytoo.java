import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class fishytoo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(f.readLine());
		for(int i = 0; i < tests; i++) {
			String[] split = f.readLine().split(" ");
			int r = Integer.parseInt(split[0]), c = Integer.parseInt(split[1]), count = 0;
			for(int j = 0; j < r; j++) {
				String a = f.readLine();
				a = a.replace("O", "");
				a = a.replace("#", "");
				count += a.length();
			}
			out.printf("Net #%d: %d Fish Nuggets\n", (i+1), count);
			
		}
		out.close();
	}
}
