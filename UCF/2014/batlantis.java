import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2014
//Problem: Batlantis

public class batlantis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			String[] words = scan.nextLine().split(" ");
			String ans = words[0];
			String added = "";
			for(int j = words[0].length()-1; j >= 0; j--){
				if(words[0].substring(j).equals(words[1].substring(0, words[0].substring(j).length()))){
					added = words[1].substring(words[0].substring(j).length()-1);
				}
			}
			added = added.substring(1);
			ans+=added;
			System.out.println("Entry #"+i+": "+ans);
		}
	}
}
