import java.util.Scanner;

// Kyle Dencker

public class C8VMA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		
		scan.nextLine();
		
		String line = scan.nextLine();
		
		

		if(n==1) {
			System.out.println(0);
			return;
		}
		
		int answer = 0;
		
		for(int i = 2; i <= n; i+=2) {
			for(int j = 0; j < line.length(); j++) {
				if(j+i <= line.length()) {
					String sub = line.substring(j, j+i);
					int[] count = new int[4];
					for(int k = 0; k < sub.length(); k++) {
						
						if(sub.charAt(k) == 'U') count[0]++;
						if(sub.charAt(k) == 'D') count[1]++;
						if(sub.charAt(k) == 'L') count[2]++;
						if(sub.charAt(k) == 'R') count[3]++;
					}
					
					
					if((count[0] == count[1]) && (count[2] == count[3])) {
						answer++;
					}
				}

			}
		}
		
		System.out.println(answer);


	}
}
