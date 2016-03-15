import java.util.Scanner;

// Kyle Dencker
// bitCount - Practice
// March 14, 2016

public class BITCNTR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i=0; i<n; i++) {
			int num = scan.nextInt();
			System.out.println(Integer.bitCount(num));
		}
	}

}
