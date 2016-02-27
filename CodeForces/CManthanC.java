import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Kyle Dencker
// Feb 26, 2016
// Backtracking Example

public class CManthanC {

	static ArrayList<Words> answer = new ArrayList<Words>();
	static boolean found = false;
	static ArrayList<Words> word = new ArrayList<Words>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String message = scan.nextLine();
		int m = scan.nextInt();
		scan.nextLine();
		for (int i=0; i<m;i++) {
			word.add(new Words(scan.nextLine()));
		}
		solve(message);
		for (int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(i).realWord + " ");
		}
		
	}
	
	public static void solve(String m) {
		if (m.length() == 0) {
			found = true;
			return;
		}
		for (int i=0; i<word.size(); i++) {
			if (m.startsWith(word.get(i).encoded)) {
				answer.add(word.get(i));
				solve(m.substring(word.get(i).length));
				if (found) return;
				answer.remove(answer.size()-1);
			}
		}
	}

}

class Words implements Comparable<Words> {

	String realWord;
	String encoded="";
	int length;
	
	public Words(String w) {
		realWord = w;
		w = w.toLowerCase();
		for (int i=0; i<w.length(); i++) {
			encoded += w.charAt(w.length()-i-1);
		}
		length = encoded.length();
	}
	@Override
	public int compareTo(Words w) {
		// TODO Auto-generated method stub
		return w.length - this.length;
	}
	
	
	
}