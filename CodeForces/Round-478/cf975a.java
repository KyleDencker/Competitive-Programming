import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class cf975a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean[][] ll = new boolean[n][26];
		sc.nextLine();
		for (int i =0 ; i < n; i++) {
			String s = sc.next();
			
			for (int j =0 ; j < s.length(); j++) {
				ll[i][s.charAt(j)-'a'] = true;
			}
		}
		
		boolean[] check = new boolean[n];
		
		int uni = 0;
		
		for (int i =0 ; i < n; i++) {
			if (!check[i]) {
				uni++;
				check[i] = true;
				
				for (int j = i+1; j < n; j++) {
					if (Arrays.equals(ll[i], ll[j])) {
						check[j] = true;
					}
				}
			}
		}
		
		System.out.println(uni);
		
	}

}
