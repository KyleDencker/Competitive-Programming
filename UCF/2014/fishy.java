import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Brett Fazio
//Code for UCF High School Programming Tournament 2014
//Problem: Fishy

public class fishy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		for (int i = 0; i < r; i++) {
			int l = sc.nextInt();
			sc.nextLine();
			String in = sc.nextLine();
			
			// These two regex Strings are the main part of solving this problem,
			// these strings represent a first (both forward and backward) where it 
			// has the proper beginning and ending and there are more than one ')' or '('
			// (depending on orientation) in the middle.
			String regForward = "><\\)+o>";
			String regBackward = "<o\\(+><";
			
			
			int out = 0;
			
			// The Pattern and Matcher are not necessary but they speed up the programming
			// of the problem, first we compile each of our regex Strings, then we create a
			// Matcher which finds all the matches in our input String.
			
			Pattern pf = Pattern.compile(regForward);
			
			Matcher mf = pf.matcher(in);
			
			while (mf.find()) {
				String local = mf.group();
			
				// 'out' is the number of rubles we have, we subtract 4 to
				// get the number of ')' in the middle and the square that number
				// per the problem description.
				out += (local.length()-4)*(local.length()-4);
			}
			
			// Same thing as above.
			
			Pattern pb = Pattern.compile(regBackward);
			
			Matcher mb = pb.matcher(in);
			
			while (mb.find()) {
				String local = mb.group();
				
				out += (local.length()-4)*(local.length()-4);
			}
			
			System.out.println("Day #" + (i+1) + ": " + (out) + " rubles");
		}

	}

}
