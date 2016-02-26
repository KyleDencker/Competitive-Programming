import java.util.Scanner;

// Kyle Dencker
// CodeForces #339B
// 1/23/2016


public class C339D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		
		if (x1 == x2 && x2 == x3) {
			System.out.println(1);
			return;
		}
		
		if (y1 == y2 && y2 == y3) {
			System.out.println(1);
			return;
		}
		
		if (x1 == x2 && x2 != x3 && y2 == y3) {
			System.out.println(2);
			return;
		}
		if (x1 == x2 && x2 != x3 && y1 == y3) {
			System.out.println(2);
			return;
		}
		
		if (x1 == x3 && x2 != x3 && y2 == y3) {
			System.out.println(2);
			return;
		}
		if (x1 == x3 && x2 != x3 && y2 == y1) {
			System.out.println(2);
			return;
		}
		
	
		if (x1==x2 && (y3 >= Math.max(y1, y2) || y3 <= Math.min(y1, y2))) {
			System.out.println(2);
			return;
		}
		if (y1==y2 && (x3 >= Math.max(x1, x2) || x3 <= Math.min(x1, x2))) {
			System.out.println(2);
			return;
		}
		
		if (x1==x3 && (y2 >= Math.max(y1, y3) || y2 <= Math.min(y1, y3))) {
			System.out.println(2);
			return;
		}
		if (y1==y3 && (x2 >= Math.max(x1, x3) || x2 <= Math.min(x1, x3))) {
			System.out.println(2);
			return;
		}
		
		if (x2==x3 && (y1 >= Math.max(y2, y3) || y1 <= Math.min(y2, y3))) {
			System.out.println(2);
			return;
		}
		if (y2==y3 && (x1 >= Math.max(x2, x3) || x1 <= Math.min(x2, x3))) {
			System.out.println(2);
			return;
		}
		
		System.out.println(3);

	}

}
