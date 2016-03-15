import java.util.Scanner;

// Kyle Dencker
// Math
// March 14, 2016

public class ACPC10A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(), b =scan.nextInt(), c= scan.nextInt();
		while (a!=0 && b!=0 && c!=0) {
			
			if (b == (a+c)/2.0) {
				System.out.println("AP " + (c+(b-a)));
			} else {
				System.out.println("GP " + (c*(b/a)));
			}
			
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
	}

}
