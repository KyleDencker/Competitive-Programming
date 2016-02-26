import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class C401B {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int runs = Integer.parseInt(stdin.readLine());
		boolean[][] board = new boolean[1000][1000];

		for (int i=0; i<runs; i++) {
			StringTokenizer tokens = new StringTokenizer(stdin.readLine());
			board[Integer.parseInt(tokens.nextToken())-1][Integer.parseInt(tokens.nextToken())-1] = true;
		}
		int answer = 0;
		for (int i=0; i<1000; i++) {
			for (int j=0; j<1000; j++) {
				if (board[i][j]) { 
					int offset = 1;
					boolean outOfBounds = false;
					boolean stopLeft = false;
					boolean stopRight = false;
					while (!outOfBounds) {
						outOfBounds = true;
						if (j+offset >= 1000) break;
						
						if (i - offset >= 0 ) {
							outOfBounds = false;
							if (board[i-offset][j+offset]) {
								stopLeft = true;
								answer++;
							}
						} 
						
						if (i + offset < 1000) {
							outOfBounds = false;
							if (board[i+offset][j+offset]) {
								stopRight = true;
								answer++;
							}
						}
						offset++;
					}

				}
				
			}
		}
		System.out.println(answer);

	}
}

class Point {

	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
