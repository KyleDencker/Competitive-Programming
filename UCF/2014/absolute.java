import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2014
//Problem: Absolute

public class absolute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			//A simple way to do this is subtract the absolute value of a number
			//from the number 0.
			System.out.println("Integer #"+i+": "+(0-Math.abs(scan.nextInt())));
		}
	}
}
