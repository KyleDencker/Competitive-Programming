import java.util.Scanner;
//David Gravett

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		
		if(a <= b-c){
			System.out.println(n/a);
		}else if(n >= c){
			long bc = (n-c)/(b-c);
			System.out.println(bc + (n-bc*(b-c)) / a);
		}else{
			System.out.println(n/a);
		}
		
	}

}
