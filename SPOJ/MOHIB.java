// Brett Fazio
// SPOJ Problem MOHIB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MOHIB {

	public static void main(String[] args) throws Throwable, IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader (System.in));

		int runs = Integer.parseInt(bu.readLine());
		
		for (int i = 0; i < runs; i++) {
			String[] ins = bu.readLine().split(" ");
			
			int x = Integer.parseInt(ins[0]);
			int avg = Integer.parseInt(ins[1]);
			
			int terms = avg - x;

			int sum = terms * (avg + 1);

			int ans = sum - ((terms-1)*(terms)/2);
//			if(!(n-2>0))
//			System.out.printf("%d\n",sum);
//			else
//			System.out.printf("%d\n",sum-((n-2)*(n-1)/2));
			System.out.println(ans);
		}

	}

}
