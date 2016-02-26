import java.util.Scanner;

/*******************
 * This was accepted during the contest
 * However it got wrong answer on the 
 * final checks.  
 * 
 * Will upload with a better solution in
 * the future
 * 
 * Kyle Dencker
 ******************/
public class C8VMC {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int two = scan.nextInt();
		int three = scan.nextInt();
		long answer = 1;
		
		while (two > 0 && three > 0) {
			answer++;

			if (answer % 6 == 0) {
				if (two/2 >= three) {
					two--;
					
				} else {
					three--;
				}
			} else if (answer % 2 == 0) {
				two--;
			} else if (answer % 3 == 0) {
				three--;
			}

		}

		while (two > 0) {
			answer++;

			if (answer % 2 == 0) {
				two--;
			}

		}

		//   1083 724
		while (three > 0) {
			if (answer % 3 == 0) {
				three--;
			}
			answer++;
		}
		System.out.println(answer);
		
	}
}
