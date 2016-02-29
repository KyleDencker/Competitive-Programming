import java.util.Scanner;
import java.util.ArrayList;

//Sharon Barak
//Code for UCF High School Programming Tournament 2013
//Problem: Battle of the Best 

public class best {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			String p1 = scan.nextLine();
			String p2 = scan.nextLine();
			int n = scan.nextInt();
			scan.nextLine();
			ArrayList<String> p1Moves = new ArrayList<String>();
			for(int j = 0; j < n; j++){
				p1Moves.add(scan.nextLine());
			}
			int m = scan.nextInt();
			scan.nextLine();
			ArrayList<String> p2Moves = new ArrayList<String>();
			for(int j = 0; j < m; j++){
				p2Moves.add(scan.nextLine());
			}
			System.out.println("Battle #"+i+"! BEGIN!!!");
			while(p1Moves.size() != 0){
				System.out.println(p1+" uses "+p1Moves.get(0)+"!");
				if(p2Moves.size() != 0){
					System.out.println(p2+" uses "+p2Moves.get(0)+"!");
				}
				else{
					System.out.println(p2+" is defeated by "+p1+"'s "+p1Moves.get(0)+"!!!");
					break;
				}
				p1Moves.remove(0);
				if(p1Moves.size() == 0){
					System.out.println(p1+" is defeated by "+p2+"'s "+p2Moves.get(0)+"!!!");
					break;
				}
				p2Moves.remove(0);
			}
		}
	}
}
