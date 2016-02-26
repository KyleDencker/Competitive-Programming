import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Kyle Dencker
// Date


public class C8VM {
	static int r,g,b;
	static boolean hr, hg, hb;
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int n = x.nextInt();
		x.nextLine();
		String input = x.nextLine();
		for (int i=0; i<input.length(); i++ ) {
			switch (input.charAt(i)){
			case 'R':
				r++;
				break;
			case 'G':
				g++;
				break;
			case 'B':
				b++;
				break;
			}
		}
		
		// all the same
		if (r==0 && g==0 && b > 0) hb = true;
		if (r==0 && g >0 && b == 0) hg = true;
		if (r > 0 && g == 0 && b == 0) hr = true;
		
		if (r>0 && g>0 && b == 0) {
			hb = true;
			if (g>1) {
				hr = true;
			}
			if (r > 1) {
				hg = true;
			}
		}
		
		if (r>0 && b>0 && g == 0) {
			hg = true;
			if (b>1) {
				hr = true;
			}
			if (r > 1) {
				hb = true;
			}
		}
		
		if (b>0 && g>0 && r == 0) {
			hr = true;
			if (g>1) {
				hb = true;
			}
			if (b > 1) {
				hg = true;
			}
		}
		
		if (r>0 && g>0 && b>0) {
			hb=true;
			hr = true;
			hg = true;
		}
		
		
		//calc(Arrays.sort(input.toCharArray()));
		if (hb) System.out.print("B");
		if (hg) System.out.print("G");
		if (hr) System.out.print("R");
		System.out.println();
		
	}
	
	public static void calc() {
		
		
	}
	
	public static String replace(String s) {
		if (s.charAt(0) == s.charAt(1)) return ""+s.charAt(0);
		if ((s.charAt(0) == 'R' || s.charAt(1) == 'R') && (s.charAt(0) == 'G' || s.charAt(1) == 'G')) {
			return "B";
		} else if ((s.charAt(0) == 'R' || s.charAt(1) == 'R') && (s.charAt(0) == 'B' || s.charAt(1) == 'B')) {
			return "G";
		} else {
			return "R";
		}
	}
}
