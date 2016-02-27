import java.util.Scanner;
import java.util.StringTokenizer;


public class GoodBye2015A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringTokenizer tokens = new StringTokenizer(input);
		
		int[] days = { 52, 52, 52, 52, 53, 53, 52 };
		
		
		int num = Integer.parseInt(tokens.nextToken());
		tokens.nextToken();
		String type = tokens.nextToken();
		
		if (type.equals("month")) {
			if (num <= 29) {
				System.out.println(12);
			} else if (num == 30) {
				System.out.println(11);
			} else {
				System.out.println(7);
			}
		} else {
			System.out.println(days[num-1]);
		}
		
	}

}
