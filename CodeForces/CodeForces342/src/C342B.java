import java.util.Scanner;


public class C342B {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		int answer = 0;
		for (int i=0; i<a.length(); i++){
			if (a.substring(i).startsWith(b)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
