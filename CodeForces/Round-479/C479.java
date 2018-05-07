import java.util.*;
/*
 * @Lior on Codeforces
 */
public class C479 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i + 1);
		}
		if (k == 0) {
			if (arr[0] - 1 == 0) {
				System.out.println(-1);
				return;
			}
			System.out.println(arr[0] - 1);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == k) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println(-1);
	}

}