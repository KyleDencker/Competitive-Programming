import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Zombie Spellcheck

public class zombie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			scan.nextLine();
			ArrayList<Word> Dictionary = new ArrayList<Word>();
			for(int j = 0; j < n; j++){
				Word diction = new Word(scan.nextLine());
				Dictionary.add(diction);
				diction.findRuns();
			}
			n = scan.nextInt();
			scan.nextLine();
			for(int j = 0; j < n; j++){
				ArrayList<String> responses = new ArrayList<String>();
				Word zombieWord = new Word(scan.nextLine());
				zombieWord.findRuns();
				for(int k = 0; k < Dictionary.size(); k++){
					if(Arrays.equals(zombieWord.runs, Dictionary.get(k).runs)){
						responses.add(Dictionary.get(k).wordName);
					}
				}
				if(responses.size() > 0){
					System.out.println("Did you mean:");
					for(int k = 0; k < responses.size(); k++){
						System.out.println(responses.get(k)+"?");
					}
				}
				else{
					System.out.println("No matches found.");
				}
			}
		}
	}
}

class Word{

	int[] runs;
	String wordName;

	public Word(String wordName){
		this.wordName = wordName;
		this.runs = new int[26];
	}

	public void findRuns(){
		char currChar = '1';
		for(int i = 0; i < wordName.length(); i++){
			if(wordName.charAt(i) != currChar){
				int index = wordName.charAt(i)-'A';
				runs[index]++;
			}
			currChar = wordName.charAt(i);
		}
	}

}