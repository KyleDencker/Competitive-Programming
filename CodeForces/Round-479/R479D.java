import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class R479D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextLong();
		}
		ArrayList<num> nums = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long val = arr[i];
			long temp = arr[i];
			int fact = 0;
			while (true) {
				if (val % 3 != 0)
					break;
				val /= 3;
				fact++;
			}
			nums.add(new num(temp, fact));
		}
		Collections.sort(nums);
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i).val + " ");
		}

	}

	public static class num implements Comparable<num> {
		long val = 0;
		int fact = 0;

		public num(long v1, int fact1) {
			this.fact = fact1;
			this.val = v1;
		}

		@Override
		public int compareTo(num o) {
			if (o.fact == this.fact) {
				if (o.val > this.val) {
					return -1;
				} else {
					return 1;
				}
			}
			return o.fact - this.fact;
		}

	}

}