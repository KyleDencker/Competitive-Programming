//Sharon Barak
//Brian Barak
//Roman Numerals Algorithm

import java.util.Scanner;

public class RomanNumerals {
	
	/*
	In order to translate Roman numerals, we must consider two things:
	1. The values for each letter.
	2. If the preceeding letter is smaller, we must subtract the first
	   letter from the next.
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			//Set up the numeric values for each letter, so that
			//I corresponds to 1, V corresponds to 5, etc.
			String key = "IVXLCDM";
			int[] value = {1, 5, 10, 50, 200, 500, 1000};
			int result = 0;
			String num = scan.nextLine();
			while(num.length() > 0){ //We will remove letters we've taken care of as we add them to our total number.
				//We use the method 'indexOf' in order to find the numeric value of the two letters.
				//In the case where we must subtract letters from eachother, we take a look at the pair as a whole.
				//Otherwise, we remove the letter we've taken care of.
				int A = value[key.indexOf(num.substring(0, 1))]; 
				int B = num.length() > 1 ? value[key.indexOf(num.substring(1, 2))] : -1; //Must make sure the string has at least 2 letter remaining.
				//In the case where there is no second letter, the value will be -1 so that B is not greater than A and we can add the single value.
				if(B > A){ //If the second letter is greater than the first, we must subtract them before adding them to our result.
					result += B-A;
					num = num.substring(2);
				}
				else{ //Otherwise we can simply add numeric value of the letter to the total result.
					result += A;
					num = num.substring(1);
				}
			}
			System.out.println(result);
		}
		scan.close();
	}
}

