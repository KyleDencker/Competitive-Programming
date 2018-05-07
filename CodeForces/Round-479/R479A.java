import java.util.Scanner;
/*
 * @NatInTheHat on Codeforces
 */
public class R479A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k = scan.nextInt();
		while (k-- > 0) {
			if (n % 10 == 0)
				n /= 10;
			else
				n--;
		}
		System.out.println(n);
	}
}