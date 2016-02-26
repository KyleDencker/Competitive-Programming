import java.util.Scanner;

public class dollar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), b = s.nextInt(), p = s.nextInt();
		int x = 0, y = p*n;
		while(n != 1) {
			int mod = n%2;
			n/=2;
			x+=(b*2+1)*n;
			n+=mod;
		}
		System.out.println(x + " " + y);
	}
}
