import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for (int i = 0 ; i < cases; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.print(a+b);
			System.out.println(" " + (a*b));
		}
	}

}
