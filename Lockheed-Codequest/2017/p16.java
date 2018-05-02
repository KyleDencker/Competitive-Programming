import java.util.Scanner;
import java.util.Stack;

public class p16 {

	static int find;
	
	static String[] item, perm;
	static boolean[] used;
	
	static boolean found;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		long time = System.currentTimeMillis();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			
			found = false;
			String[] spl = sc.nextLine().split(":");
			
			find = Integer.parseInt(spl[0]);
			
			item = spl[1].split( " ");
			
			perm = new String[item.length];
			used = new boolean[item.length];
			
			permute(0);
			
			System.out.println(found ? "TRUE" : "FALSE");
			
		}
		
//		System.out.println(System.currentTimeMillis()-time);
	}
	
	public static int prece(char in) {
		if (in == '*') {
			return 3;
		}
		if (in == '/') {
			return 3;
		}
		if (in == '+') {
			return 1;
		}
		if (in == '-') {
			return 1;
		}
		return -1;
	}
	
	public static void permute(int pos) {
		if (found) return;
		int j = 0;
		if (pos >= item.length) {
			
			String op = "+-/*";
			
			for (int i = 1; i < perm.length; i+=2) {	
				if (!op.contains(perm[i])) {
					return;
				}
			}
			
			int sum = 0;
			
			Stack<Integer> operand = new Stack<>();
			Stack<Character> operators = new Stack<>();
			
			for (int i =0 ; i < perm.length; i++) {
				if (i % 2 == 0) {
					// operand
					
					operand.push(Integer.parseInt(perm[i]));
					
				}else {
					if (operators.isEmpty()) {
						operators.push(perm[i].charAt(0));
					}else {
						char cur = perm[i].charAt(0);
						while (prece(operators.peek()) > prece(cur)) {
							int b = operand.pop();
							int a = operand.pop();
							
							char pop = operators.pop();
							
							if (pop == '*') {
								operand.push(b*a);
							}
							if (pop == '+') {
								operand.push(b+a);
							}
							if (pop == '-') {
								operand.push(b-a);
							}
							if (pop == '/') {
								if (a==0) {
									return;
								}
								if (b%a != 0) {
									return;
								}
								operand.push(b/a);
							}
							
							if (operators.isEmpty()) {
								break;
							}
							
						}
						
						operators.push(cur);
						
						
					}
				}
			}
			while (!operators.isEmpty()) {
				int b = operand.pop();
				int a = operand.pop();
				
				char pop = operators.pop();
				
				if (pop == '*') {
					operand.push(b*a);
				}
				if (pop == '+') {
					operand.push(b+a);
				}
				if (pop == '-') {
					operand.push(b-a);
				}
				if (pop == '/') {
					if (a == 0) {
						return;
					}
					if (b%a != 0) {
						return;
					}
					operand.push(b/a);
				}
				
				
			}
			
			if (operand.pop() == find) {
				found = true;
				return;
			}
			
		}else {
			for (j = 0; j < item.length; j++) {
				if (!used[j]) { 
					if (pos > 0) {
						int preceprev = prece(perm[pos-1].charAt(0));
						
						if (preceprev < 0 && prece(item[j].charAt(0)) < 0) {
							continue;
						}
						if (preceprev > 0 && prece(item[j].charAt(0)) > 0) {
							continue;
						}
					}
					used[j] = true;
					
					perm[pos] = item[j];
					permute(pos+1);
					used[j] = false;
				}
			}
		}
	}

}


/*

4
12:4 3 9 * /
14:8 122 - 17 *
2133:+ + 5 6 7 20 -
1:* 7 7 1 /


4 + 5 / 7 + 9 * 5

S : 4 5 7 
O : + /

S : 4 0.8
O : 

1
907:22 35 - * / 20 48 + 0

3
907:22 35 - * / 20 48 + 0
921:- 1 50 20 - / * 45 1
339:+ 33 / - 30 - 50 31 46

*/