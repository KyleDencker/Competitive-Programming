import java.text.DecimalFormat;
import java.util.Scanner;

public class fractal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		for(int runs = 0; runs < tests; runs++) {
			int a = s.nextInt(), b = s.nextInt(), c = a+b;
			DecimalFormat format = new DecimalFormat("#.00");
			System.out.printf("Fraction #%d: ", (runs+1));
			if(c < 0) {
				System.out.println("DNE");
			} else {
				double d = Math.sqrt(c);
				System.out.println(format.format(d));
			}
		}
	}
}
