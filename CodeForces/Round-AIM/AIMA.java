import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class AIMA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int d = scan.nextInt();
		int L = scan.nextInt();
		int totalV = scan.nextInt() + scan.nextInt();
		double answer = 1.0*(L-d)/totalV;
		out.printf("%.6f",answer);
		
		
		out.flush();
		out.close();

	}

}
