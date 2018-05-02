import java.util.Scanner;

public class Educational_Round_39C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();						//Scan in input
		int count = 0;										//Keep count in place of the alphabet
		StringBuilder sb = new StringBuilder();				//Stringbuilder to manipulate strings easier with count
		sb.append(str);										
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) - 'a'<= count && count<26) {	//If the character is equal to the character one letter before it in the alphabet
				sb.setCharAt(i, (char)(count + 'a'));		//Change that letter to be 1 higher than the previous
				count++;									//Keeping place in alphabet
			}
		}
		if(count==26)System.out.println(sb.toString());		//If count is 26, then we have looped through the whole alphabet
		else System.out.println("-1");
		scan.close();
	}

}