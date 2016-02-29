import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Musical Chairs

public class chairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			System.out.println("Round #"+i+": "+(scan.nextInt()-scan.nextInt())+" children eliminated");
		}
	}
}
