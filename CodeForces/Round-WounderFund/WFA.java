import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WFA {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String answer = Integer.toBinaryString(Integer.parseInt(stdin.readLine()));
		
		int length = answer.length();
		//System.out.println(answer);
		for (int i=0; i<length; i++) {
			if (answer.charAt(i) == '1')
				System.out.print(answer.length()-i + " ");
		}
		
		
	}

}
