import java.util.Scanner;


public class GoodBye2015B {

	static String currentBinary;
	static String binaryStart;
	static String binaryEnd;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long start = scan.nextLong();
		long end = scan.nextLong();
		long count = 0;
		long find = -1;

		if (start == end) {
			int size = Long.SIZE - Long.numberOfLeadingZeros(start);
			if (size - Long.bitCount(start) == 1) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			return;
		}
		
		// Find the first number.
		for (long i=start; i<=end; i++) {
			int size = Long.SIZE - Long.numberOfLeadingZeros(i);
			if (size - Long.bitCount(i) == 1) {
				find = i;
				//count++;
				break;
			}
		}
		if (find == -1) {
			System.out.println(0);
			return;
		}

		String answer = Long.toBinaryString(find);
		String bEnd = Long.toBinaryString(end);
		
		if (answer.length() == 1) answer = "10";
		if (answer.length() > 1) {
			count+= answer.length() - answer.indexOf('0');
			answer = "0" + answer.replace('0', '1');
		}
		
		while (answer.length() < bEnd.length()) {
			count += answer.length() - 1;
			answer = "0" + answer.replace('0', '1');
		}
		
		
		int index = 0;

		while (answer.length() == bEnd.length() && answer.compareTo(bEnd) < 0 && index+1 != answer.length()) {
			answer = swap(answer, index, index+1);
			if (answer.compareTo(bEnd)<= 0) {
				count++;
				index++;
			}
		}


		System.out.println(count);

	}

	public static String swap(String s, int i0, int i1) {
		String s1 = s.substring(0, i0);
		String s2 = s.substring(i0+1, i1);
		String s3 = s.substring(i1+1);
		return s1+s.charAt(i1)+s2+s.charAt(i0)+s3;
	}
}