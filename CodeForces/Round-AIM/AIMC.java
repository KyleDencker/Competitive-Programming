import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class AIMC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] adjArray = new int[n][n];
		
		for (int i=0; i<n; i++) {
			Arrays.fill(adjArray[i], 0);
		}
		
		for (int i=0; i<m; i++) {
			int x = scan.nextInt()-1;
			int y = scan.nextInt()-1;
			adjArray[x][y]++;
		}
		
		printArray(adjArray);
		
		for (int i=0; i<n; i++) {
			if(position(adjArray, i, n)) {
				System.out.println("Yes");
				for (int j=0; j<n; j++) {
					System.out.print("b");
				}
				System.out.println();
				return;
			}
		}
		System.out.println("No");
		out.flush();
		out.close();

	}

	public static boolean position(int[][] a, int loc, int steps) {
		if (steps-1==0) return true;
		for (int i=0; i<a.length; i++) {
			if (a[loc][i]>0) {
				if (position(a, i, steps-1)){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void printArray(int[][] a) {
		System.out.println("Start Print");
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("End Print\n");
	}
	
	
}
