import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Force

public class force {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			//The formula for force is mass multiplied by the acceleration.
			//Since you are given both of these variables all you need to
			//do is multiply them together to find the force.
			System.out.println("Force #"+i+": "+scan.nextInt()*scan.nextInt());
		}
	}
}
