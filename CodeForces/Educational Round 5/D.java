import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer tokens = new StringTokenizer(stdin.readLine());

		int n = Integer.parseInt(tokens.nextToken());
		int k = Integer.parseInt(tokens.nextToken());
		
		int start_index = 1;
		int end_index = 1;
		int longest = 1;
		int current = 1;
		int last_num = -1;
		int index = 1;
		

		
		tokens = new StringTokenizer(stdin.readLine());
		last_num = Integer.parseInt(tokens.nextToken());
		ArrayList<Integer> used = new ArrayList<Integer>();
		used.add(last_num);
		
		while (tokens.hasMoreTokens()) {
			int temp = Integer.parseInt(tokens.nextToken());
						
		}
		out.println(start_index + " " + end_index);
		out.flush();
		out.close();
		
		
	}
}