import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		ArrayList<Res> males = new ArrayList<Res>();
		ArrayList<Res> females = new ArrayList<Res>();
		
		ArrayList<Res> everyone = new ArrayList<Res>();
		ArrayList<Res> leave = new ArrayList<Res>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer tokens = new StringTokenizer(scan.nextLine());
			Res temp = new Res(tokens.nextToken().charAt(0), Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken()));
			everyone.add(temp);
			//leave.add(temp);
		}
		Collections.sort(everyone);
		Res.sort = false;
		//Collections.sort(leave);
		//Res.sort = true;
		int answer = 0;
		for (int i=0; i<n; i++) {
			Res temp = everyone.get(0);
			everyone.remove(0);
			while (!males.isEmpty() && temp.start > males.get(0).end) {
				males.remove(0);
			}
			while (!females.isEmpty() && temp.start > females.get(0).end) {
				females.remove(0);
			}
			if (temp.gender) {
				males.add(temp);
				Collections.sort(males);
			}
			else {
				females.add(temp);
				Collections.sort(females);
			}
			//System.out.println(temp.start + " " + males.size() + " " + females.size());
			int maybeAnswer = Math.min(males.size(), females.size());
			answer = Math.max(answer, maybeAnswer);
			
		}
		
			
		System.out.println(answer*2);
	}

}

class Res implements Comparable<Res> {
	
	boolean gender;
	int start;
	int end;
	public static boolean sort = true;
	
	public Res(char gender, int start, int end) {
		this.gender = (gender == 'M');
		this.start  = start;
		this.end 	= end;
	}

	@Override
	public int compareTo(Res o) {
		if (sort) return start - o.start;
		return end - o.end;
	}
}
