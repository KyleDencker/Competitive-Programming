import java.util.Scanner;

// Kyle Dencker
// Feb 26, 2016
// Math, Algebra

public class CManthanA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int i=0;
		while (i*a <= c) {
			if ((c-i*a)%b==0) {
				System.out.println("Yes");
				return;
			}
			i++;
		}
		
		System.out.println("No");
	}

}
