import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2013
//Problem: Rock Paper Shenanigans

public class shenanigans {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			scan.nextLine();
			int p1 = 0;
			int p2 = 0;
			for(int j = 0; j < n; j++){
				String[] input = scan.nextLine().split(" ");
				if(input[0].equals("R") && input[1].equals("S") || input[0].equals("S") && input[1].equals("P") || input[0].equals("P") && input[1].equals("R")){
					p1++;
				}
				if(input[0].equals("P") && input[1].equals("S") || input[0].equals("R") && input[1].equals("P") || input[0].equals("S") && input[1].equals("R")){
					p2++;
				}
			}
			if(p1 > p2) System.out.println("Game #"+i+": Looks like Andrew won again.");
			else System.out.println("Game #"+i+": Oh snap! Gabe beat Andrew!");
		}
	}
}
