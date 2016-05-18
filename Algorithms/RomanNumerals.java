//Sharon Barak
//Brian Barak
//Roman Numerals Algorithm

import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			String key = "IVXLCDM";
			int[] value = {1, 5, 10, 50, 200, 500, 1000};
			int result = 0;
			String num = scan.nextLine();
			while(num.length() > 0){
				int A = value[key.indexOf(num.substring(0, 1))];
				int B = num.length() > 1 ? value[key.indexOf(num.substring(1, 2))] : -1;
				if(B > A){
					result += B-A;
					num = num.substring(2);
				}
				else{
					result += A;
					num = num.substring(1);
				}
			}
			System.out.println(result);
		}
		scan.close();
	}
}

