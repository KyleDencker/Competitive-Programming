import java.util.Scanner;

// Kyle Dencker
// CodeForces #339B
// 1/23/2016

public class C339B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runs = scan.nextInt();
		long answer = 0;
		int lastFind = -1;
		
		for (int i=0; i<runs; i++) {
			int input = scan.nextInt();
			
			if (input == 1) {
				
				if (lastFind == -1) {
					lastFind = i;
					answer++;
				} else {
					answer *= i - lastFind;
					lastFind = i;
				}
			}
		}
		
		System.out.println(answer);

	}

}
