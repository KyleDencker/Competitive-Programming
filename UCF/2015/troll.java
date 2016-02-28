import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2015
//Problem: Troll

public class troll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long t = scan.nextLong();
		for(int i = 1; i <= t; i++){
			System.out.println("Situation #"+i+": "+(scan.nextInt()*scan.nextInt()));
		}
	}
}
