import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2015
//Problem: Flower

public class flower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			int min = 101;
			scan.nextLine();
			for(int j = 0; j < n; j++){
				String[] s = scan.nextLine().split(" ");
				int speed = Integer.parseInt(s[1]);
				int currmin = min;
				if(speed < currmin && j != n-1) min = speed;
			}
			System.out.println("Assembly #"+i+": "+min);
		}
	}
}
