import java.text.DecimalFormat;
import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2014
//Problem: Sponge

public class sponge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			double l = scan.nextDouble();
			double s = scan.nextDouble();
			double ratio = 20.0/27.0;
			DecimalFormat df = new DecimalFormat("0.000");
			double ans = Math.pow(ratio, l)*s*s*s;
			System.out.println("Sponge #"+i+": "+df.format(ans));
		}
	}
}
