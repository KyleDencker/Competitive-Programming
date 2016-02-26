import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer tokens = new StringTokenizer(stdin.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		int[][] answer = new int[n][m];
		
		for (int i=0; i<n; i++) {
			int j=0;
			tokens = new StringTokenizer(stdin.readLine());
			while (tokens.hasMoreTokens()) {
				answer[i][j] = Integer.parseInt(tokens.nextToken());
				j++;
			}
		}
		int realAnswer = -1;
		for (int i=0; i<n; i++) {
			int temp_low = Integer.MAX_VALUE;
			
			for (int j=0; j<m; j++) {
				if (temp_low > answer[i][j]) {
					temp_low = answer[i][j];
				}
			}
			if (realAnswer < temp_low) {
				realAnswer = temp_low;
			}
		}
		
		out.println(realAnswer);
		out.flush();
		out.close();
		
	}

}
