// Brett Fazio
// SPOJ Problem CANDY

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CANDY {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bu = new BufferedReader( new InputStreamReader( System.in));
		
		while (true) {
			int N = Integer.parseInt(bu.readLine());
			if (N == -1) {
				break;
			}
			
			ArrayList<Integer> inputs = new ArrayList<>();
			
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				inputs.add(Integer.parseInt(bu.readLine()));
				sum += inputs.get(i);
			}
			
			if (sum%N == 0) {
				int moves = 0;
				for (int i = 0; i < inputs.size(); i++) {
					if (inputs.get(i) < sum/N) {
						
					}else if (inputs.get(i) > sum/N) {
						moves += inputs.get(i)-(sum/N);
					}
				}
				
				System.out.println(moves);
			}else {
				System.out.println(-1);
			}
		}

	}

}
