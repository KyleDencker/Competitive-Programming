import java.util.Arrays;
import java.util.Scanner;

public class cf975b {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		long[] a = new long[14];
		
		long max = 0;
		for (int i =0 ; i < 14; i++) {
			a[i] = sc.nextLong();
			
			if (a[i] % 2 == 0) {
				max += a[i];
			}
		}
		
		
		
		for (int i =0 ; i < 14; i++) {
			if (a[i] % 2 == 1) {
				long[] copy = Arrays.copyOf(a, 14);
				
				max = Math.max(max, change(copy,i));
			}
		}
		
		System.out.println(max);
	}
	
	public static long change(long[] arr, int pos) {
		long ret = 0;
		
		long per = arr[pos]/14;
		
		long[] adder = new long[14];
		
		for (int i = 0; i < 14; i++) {
			adder[i] = per;
		}
		
//		if (arr[pos]%14 != 0) {
//			moves+= arr[pos]%14;
//		}
		
		long mod = arr[pos]%14;
		
		int idxadder = 0;
		idxadder %= 14;
		while (mod > 0) {
			adder[idxadder]++;
			idxadder++;
			idxadder %= 14;
			mod--;
		}
		
		arr[pos] = 0;
		
		int idx = pos+1;
		idxadder = 0;
		idx %= 14;
		long moves = 14;
		while (moves > 0) {
			arr[idx] += adder[idxadder];
			idx++;
			idx %= 14;
			idxadder++;
			idxadder %= 14;
			moves--;
		}
		
		for (int i =0 ; i < 14; i++) {
			if (arr[i] % 2 == 0) {
				ret += arr[i];
			}
		}
		
		return ret;
	}

}
