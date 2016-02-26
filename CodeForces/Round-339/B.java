import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;


public class B {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		stdin.readLine();
		String[] input = stdin.readLine().split(" ");
		long countZeros=0;
		String nonZero = "1";
		String pattern = "1[0]*";
		for (int i=0; i<input.length; i++) {
			if (input[i].equals("0")) { 
				out.println("0"); 
				out.flush(); 
				out.close(); 
				return; 
			} else if (input[i].matches(pattern)){
				countZeros += input[i].length()-1;
			} else {
				nonZero = input[i];
			}
		}
		out.print(nonZero);
		for (int i=0; i<countZeros; i++) {
			out.print("0");
		}
		out.flush();
		out.close();
	}

}
