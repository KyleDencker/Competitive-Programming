import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Batarang

public class track {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			int l = scan.nextInt();
			int r1 = scan.nextInt();
			int r2 = scan.nextInt();
			int lap1 = scan.nextInt();
			int lap2 = scan.nextInt();
			double m1 = (l*2 + (2*r1*Math.PI))*lap1;
			double m2 = (l*2 + (2*r2*Math.PI))*lap2;
			int ans = (int) Math.round(m2-m1);
			if(ans > 0) System.out.println("Track #"+i+": I've run "+ans+" more meters than Mack!!!");
			else System.out.println("Track #"+i+": Drats!");
		}
	}
}
