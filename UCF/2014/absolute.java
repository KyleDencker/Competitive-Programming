import java.util.Scanner;

public class absolute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			System.out.println("Integer #"+i+": "+(0-Math.abs(scan.nextInt())));
		}
	}
}
