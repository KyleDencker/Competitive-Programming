// Brett Fazio
// SPOJ Problem HMBY

import java.util.Scanner;

public class HMBY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 2
		int B = sc.nextInt(); // 4
		int C = sc.nextInt(); // 8
		int D = sc.nextInt(); // 16
		int E = sc.nextInt(); // 32
		int w = sc.nextInt();
		
		while (w - 32 >= 0 && E > 0) {
			w -= 32;
			E--;
		}
		
		while (w - 16 >= 0 && D > 0) {
			w -= 16;
			D--;
		}
		
		while (w - 8 >= 0 && C > 0) {
			w -= 8;
			C--;
		}
		
		while (w - 4 >= 0 && B > 0) {
			w -= 4;
			B--;
		}
		
		while (w - 2 >= 0 && A > 0) {
			w -= 2;
			A--;
		}
		
		if (w == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
}
