import java.util.*;
/*
 * @NatInTheHat on Codeforces
 */
public class R479B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		HashMap<String, Integer> h = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n - 1; i++) {
			String temp = s.substring(i, i + 2);
			h.put(temp, h.getOrDefault(temp, 0) + 1);
			set.add(temp);
		}
		int res = 0;
		String ans = "";
		for (String str : set) {
			if (res < h.get(str)) {
				res = h.get(str);
				ans = str;
			}
		}
		System.out.println(ans);
	}
}