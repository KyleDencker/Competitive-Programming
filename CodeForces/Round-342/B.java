import java.util.Scanner;

//David Gravett

public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String input2 = scan.nextLine();
		
		int counter = 0;
		int index;
		int offset = 0;
		
		while((index = input.indexOf(input2, offset)) != -1){
			offset = index + input2.length();
			counter++;
		}
		System.out.println(counter);
		
		
	}

}
