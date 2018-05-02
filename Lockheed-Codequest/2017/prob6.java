import java.util.Arrays;
import java.util.Scanner;

public class prob6 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		int in = sc.nextInt();
		
		for (int i = 0; i < in; i++) {
			
			int num = sc.nextInt();
			sc.nextLine();
			for (int j =0; j < num; j++) {
				String word = sc.nextLine();
				
				char[] ccc = word.toUpperCase().toCharArray();
				
				String[] s = new String[ccc.length];
				for (int k =0 ; k < s.length;k++) {
					s[k] += ccc[k];
				}
				
				for (int k =0; k < s.length; k++) {
					s[k] = s[k].trim();
					if (s[k].contains("A")) {
						s[k] = "Alpha";
					}else if (s[k].contains("B")) {
						s[k] = "Bravo";
					}else if (s[k].contains("C")) {
						s[k] = "Charlie";
					}else if (s[k].contains("D")) {
						s[k] = "Delta";
					}else if (s[k].contains("E")) {
						s[k] = "Echo";
					}else if (s[k].contains("F")) {
						s[k] = "Foxtrot";
					}else if (s[k].contains("G")) {
						s[k] = "Golf";
					}else if (s[k].contains("H")) {
						s[k] = "Hotel";
					}else if (s[k].contains("I")) {
						s[k] = "India";
					}else if (s[k].contains("J")) {
						s[k] = "Juliet";
					}else if (s[k].contains("K")) {
						s[k] = "Kilo";
					}else if (s[k].contains("L")) {
						s[k] = "Lima";
					}else if (s[k].contains("M")) {
						s[k] = "Mike";
					}else if (s[k].contains("N")) {
						s[k] = "November";
					}else if (s[k].contains("O")) {
						s[k] = "Oscar";
					}else if (s[k].contains("P")) {
						s[k] = "Papa";
					}else if (s[k].contains("Q")) {
						s[k] = "Quebec";
					}else if (s[k].contains("R")) {
						s[k] = "Romeo";
					}else if (s[k].contains("S")) {
						s[k] = "Sierra";
					}else if (s[k].contains("T")) {
						s[k] = "Tango";
					}else if (s[k].contains("U")) {
						s[k] = "Uniform";
					}else if (s[k].contains("V")) {
						s[k] = "Victor";
					}else if (s[k].contains("W")) {
						s[k] = "Whiskey";
					}else if (s[k].contains("X")) {
						s[k] = "Xray";
					}else if (s[k].contains("Y")) {
						s[k] = "Yankee";
					}else if (s[k].contains("Z")) {
						s[k] = "Zulu";
					}
				}
//				System.out.println(Arrays.toString(s));
				for (int k =0; k < s.length; k++) {
					if (s[k].equals("null")) {
						System.out.print(" ");
					}else {
						if (k - 1 >= 0 && !(s[k-1].equals("null"))) {
							System.out.print("-");
						}
						System.out.print(s[k]);
						
					}
				}
				System.out.println();
			}
			
		}
	}

}

/*
2
2
Code Quest
Rocks
1
Lockheed

*/
