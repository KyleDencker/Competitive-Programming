import java.util.ArrayList;
import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Zzzyyx or I’m Out

public class zzzyyx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			int k = scan.nextInt();
			scan.nextLine();
			String alphabet = scan.nextLine();
			String letters = scan.nextLine();
			ArrayList<String> given = new ArrayList<String>();
			for(int j = 0; j < letters.length(); j++){
				given.add(letters.substring(j, j+1));
			}
			String ans = "";
			for(int j = 0; j < alphabet.length(); j++){
				String curr = alphabet.substring(j, j+1);
				while(given.contains(curr)){
					if(ans.length() < k){
						ans += curr;
						given.remove(given.indexOf(curr));
					}
					if(ans.length() == k) break;
				}
				if(ans.length() == k) break;
			}
			System.out.println(ans);
		}
	}
}
