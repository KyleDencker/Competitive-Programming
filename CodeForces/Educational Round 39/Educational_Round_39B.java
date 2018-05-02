import java.util.Scanner;

public class Educational_Round_39B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong(), m = scan.nextLong();  //Scan in input
		for (;;) {										//Loop infinitely since we don't know how long process will take
			if (n == 0 || m == 0)						//Constraint listed in problem
				break;
			else if (n >= m * 2)						//We use % here because - would give us a TLE error
				n %= m * 2;
			else if (m >= n * 2)
				m %= n * 2;								//We use % here because - would give us a TLE error
			else
				break;									//If we can't do process anymore, end the program
		}
		System.out.println(n + " " + m);				//Printing
		scan.close();									//Close resource leak
	}		
}