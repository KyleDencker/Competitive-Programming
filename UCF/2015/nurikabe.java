import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class nurikabe {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(f.readLine());
		for(int i = 0; i < tests; i++) {
			String[] split = f.readLine().split(" ");
			int r = Integer.parseInt(split[0]), c = Integer.parseInt(split[1]), k = Integer.parseInt(split[2]), poundC = 0;
			int p1 = -1, p2 = -1;
			ArrayDeque<Integer> list = new ArrayDeque<Integer>(), list2 = new ArrayDeque<Integer>();
			int[] nums = new int[k];
			boolean right = true;
			char[][] grid = new char[r][c];
			for(int j = 0; j < r; j++) {
				String line = f.readLine();
				for(int l = 0; l < c; l++) {
					grid[j][l] = line.charAt(l);
					if(grid[j][l] == '#') {
						poundC++;
						p1 = j; p2 = l;
					}
				}
			}
			for(int j = 0; j < k; j++) {
//				System.out.println("J: " + j);
				split = f.readLine().split(" ");
				int a = Integer.parseInt(split[0])-1, b = Integer.parseInt(split[1])-1;
				grid[a][b] = split[2].charAt(0);
				nums[j] = Integer.parseInt(split[2]);
				list2.addLast(a); list2.addLast(b);
			}

			list.clear();
			list.addLast(p1); list.addLast(p2);
			int count = 1;
			System.out.println(list.toString());
			while(!list.isEmpty()) {
				int X = list.poll(), Y = list.poll();
				System.out.println(X);
				System.out.println(Y);
				if(inBounds(X+1, r) && grid[X+1][Y] == '#') {
					count++;
					list.addLast(X+1); 
					list.addLast(Y);
				}
				if(inBounds(X-1, r) && grid[X-1][Y] == '#') {
					count++;
					list.addLast(X-1); 
					list.addLast(Y);
					System.out.println(list.toString());
				}
//				if(inBounds(Y+1, c) && grid[X][Y+1] == '#') {
//					count++;
//					list.addLast(X);
//					list.addLast(Y+1);
//				}
			}
			
			if(poundC != count) right = false;
			if(right) {
				for(int j = 0; j < k; j++) {
					ArrayDeque<Integer> list3 = new ArrayDeque<Integer>();
					list3.add(list2.poll()); list3.add(list2.poll());
					int counter = 1;
					while(!list3.isEmpty()) {
						int X = list3.poll(), Y = list3.poll();
						if(inBounds(X+1, r) && grid[X+1][Y] == '.') {
							counter++;
							list3.addLast(X+1); list3.addLast(Y);
						}
						if(inBounds(X-1, r) && grid[X-1][Y] == '.') {
							counter++;
							list3.addLast(X-1); list3.addLast(Y);
						}
						if(inBounds(Y+1, c) && grid[X][Y+1] == '.') {
							counter++;
							list3.addLast(X); list3.addLast(Y+1);
						}
						if(inBounds(Y-1, c) && grid[X][Y-1] == '.') {
							counter++;
							list3.addLast(X); list3.addLast(Y-1);
						}
					}
					if(counter != nums[k]) {
						right = false;
						break;
					}
				}
			}
			if(right) System.out.println("Correct");
			else System.out.println("Incorrect");
		}
	}

	static boolean inBounds(int x, int bound) {
		if(x >= 0 && x < bound) return true;
		return false;
	}
}
