import java.util.Scanner;

public class eggs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		for(int i = 0; i < tests; i++) {
			int age = s.nextInt(), v = s.nextInt();
			System.out.printf("Breakfast #%d: ", (i+1));
			if(age < 18) System.out.println(4);
			else if(v < 350000) System.out.println(5);
			else System.out.println(0);
		}
	}
}
