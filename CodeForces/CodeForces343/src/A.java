import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] rows = new int[n];
		int[] cols = new int[n];
		
		for (int i=0; i<n; i++) {
			String input = scan.nextLine();
			for (int j=0; j<n; j++) {
				if (input.charAt(j) == 'C') {
					rows[i]++;
					cols[j]++;
				}
			}
		}
		
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			//System.out.println(answer + " " + rows[i] + " " + cols[i]);
			while (rows[i] > 0) {
				answer += rows[i]-1;
				rows[i]--;
			}
			
			while (cols[i] > 0) {
				answer += cols[i]-1;
				cols[i]--;
			}
		}
		System.out.println(answer);
		
	}

}
