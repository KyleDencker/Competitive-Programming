import java.util.ArrayList;
import java.util.Scanner;

// Kyle Dencker
// Feb 26, 2016
// Math, Finding number of trailing zeros

public class CManthanB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		ArrayList<Long> list = new ArrayList<Long>();
		
		long num = 1;
		while (true) {
			long temp = findTrailingZeros(num);
			if (temp == m) {
				list.add((long)num);
			} else if (temp > m) {
				break;
			}
			num++;
		}
		System.out.println(list.size());
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
	static long findTrailingZeros(long  n)
	{
	    long count = 0;
	 
	    for (int i=5; n/i>=1; i *= 5)
	          count += n/i;
	 
	    return count;
	}
}