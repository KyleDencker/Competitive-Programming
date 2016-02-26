import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int runs = Integer.parseInt(stdin.readLine());
		for (int i=0; i<runs; i++) {
			int items = Integer.parseInt(stdin.readLine());
			ArrayList<Long> array = new ArrayList<Long>();
			StringTokenizer tokens = new StringTokenizer(stdin.readLine());
			while (tokens.hasMoreTokens()) {
				array.add(Long.parseLong(tokens.nextToken()));
			}
			Collections.sort(array);
			long answer = 0;
			

			System.out.println(answer);
		}
	}

}
