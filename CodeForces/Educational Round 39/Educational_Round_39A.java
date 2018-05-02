import java.util.Scanner;
/*
 * Enrique Rodriguez
 */
public class Educational_Round_39A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();			//Scan in input
		int total = 0;				//Counter
		for (int i = 0; i < n; i++) {
			total += Math.abs(scan.nextInt());//Loop n times, adding the absolute value of the next scanned number to total
		}
		System.out.println(total);		//Print total
		scan.close();				//Close resource leak
	}
}
