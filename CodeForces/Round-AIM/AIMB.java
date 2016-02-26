import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class AIMB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		int[] a = new int[n];
		long answer = 0;
		for (int i=0; i<n; i++) {
			a[i] = scan.nextInt();
			answer+=a[i];
		}
		Arrays.sort(a);
		boolean changes = true;
		while (changes) {
			changes = false;
			for(int i=0; i<n-1; i++) {
				if (a[i] == a[i+1] && a[i] != 0) {
					answer--;
					a[i]--;
					changes = true;
				}
				
			}
			
		//	System.out.println();
		}
		System.out.println(answer);
		
	}
}
