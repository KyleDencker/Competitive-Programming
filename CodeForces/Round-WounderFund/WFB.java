import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WFB {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int sides = Integer.parseInt(stdin.readLine());
		//int[][] answer = new int[sides][sides]; 
		int[] answer = new int[sides];
		boolean[] used = new boolean[sides];
		
		for (int i=0; i<sides; i++) {
			StringTokenizer tokens = new StringTokenizer(stdin.readLine());
			for (int j=0; j<sides; j++) {
				answer[i] = Math.max(answer[i], Integer.parseInt(tokens.nextToken()));
			}
		}
		
		for (int i=0; i<answer.length; i++) {
			if (used[answer[i]-1]) {
				for (int j=answer[i]; j<used.length; j++) {
					if (!used[j]) {
						used[j] = true;
						answer[i] = j+1;
					}
				}
			} else {
				used[answer[i]-1] = true;
			}
			System.out.print(answer[i] + " ");
		}		
	}

}
