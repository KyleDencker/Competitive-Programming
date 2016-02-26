import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Bacon

public class bacon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			int count = 0;
			String sentence = scan.nextLine();
			for(int j = 0; j < sentence.length()-5; j+= 1){
				//Count the number of times the word "France" appears
				//in a sentence
				if(sentence.substring(j, j+6).equals("France")) count++;
			}
			System.out.println("Sentence #"+i+": "+count);
		}
	}
}
