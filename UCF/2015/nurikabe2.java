import java.util.ArrayDeque;
import java.util.Scanner;

public class nurikabe2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		for(int runs = 0; runs < tests; runs++) {
			boolean add = false, right = true;
			int row = s.nextInt(), column = s.nextInt(), k = s.nextInt(), poundC = 0;
			int[] values = new int[k];
			ArrayDeque<Integer> poundList = new ArrayDeque<Integer>(), check = new ArrayDeque<Integer>();
			s.nextLine();
			char[][] grid = new char[row][column];
			for(int i = 0; i < row; i++) {
				String line = s.nextLine();
				for(int j = 0; j < column; j++) {
					grid[i][j] = line.charAt(j);
					if(!add && grid[i][j] == '#') {
						poundList.addLast(i);
						poundList.addLast(j);
						add = true;
					}
					if(grid[i][j] == '#') poundC++;
				}
			}
//			s.nextLine();
			for(int i = 0; i < k; i++) {
				int a = s.nextInt()-1, b = s.nextInt()-1;
				grid[a][b] = s.next().trim().charAt(0);
				values[i] = Integer.parseInt(grid[a][b] + "");
				check.addLast(a); check.addLast(b);
//				System.out.println(grid[a][b]);
			}
			
			int poundCount = 0;
			while(!poundList.isEmpty()) {
				int x = poundList.poll(), y = poundList.poll();
				if(inBounds(x+1, row) && grid[x+1][y] == '#') {
					grid[x+1][y] = '_';
					poundList.addLast(x+1);
					poundList.addLast(y);
					poundCount++;
				}
				if(inBounds(x-1, row) && grid[x-1][y] == '#') {
					grid[x-1][y] = '_';
					poundList.addLast(x-1);
					poundList.addLast(y);
					poundCount++;
				}
				if(inBounds(y+1, column) && grid[x][y+1] == '#') {
					grid[x][y+1] = '_';
					poundList.addLast(x);
					poundList.addLast(y+1);
					poundCount++;
				}
				if(inBounds(y-1, column) && grid[x][y-1] == '#') {
					grid[x][y-1] = '_';
					poundList.addLast(x);
					poundList.addLast(y-1);
					poundCount++;
				}
			}
			if(poundCount != poundC) right = false;
			
			if(right) {
				for(int i = 0; i < k; i++) {
					ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
					temp.add(check.poll()); temp.add(check.poll());
					int count = 1;
					while(!temp.isEmpty()) {
						int x = temp.poll(), y = temp.poll(); 
						if(inBounds(x+1, row) && grid[x+1][y] == '.') {
							grid[x+1][y] = '_';
							temp.addLast(x+1);
							temp.addLast(y);
							count++;
						}
						if(inBounds(x-1, row) && grid[x-1][y] == '.') {
							grid[x-1][y] = '_';
							temp.addLast(x-1);
							temp.addLast(y);
							count++;
						}
						if(inBounds(y+1, column) && grid[x][y+1] == '.') {
							grid[x][y+1] = '_';
							temp.addLast(x);
							temp.addLast(y+1);
							count++;
						}
						if(inBounds(y-1, column) && grid[x][y-1] == '.') {
							grid[x][y-1] = '_';
							temp.addLast(x);
							temp.addLast(y-1);
							count++;
						}
					}
					if(count != values[i]) {
						right = false;
						break;
					}
				}
			}
			System.out.printf("Puzzle #%d: ", (runs+1));
			if(right) System.out.println("Correct");
			else System.out.println("Incorrect");
		}
	}
	
	static boolean inBounds(int x, int bound) {
		if(x >= 0 && x < bound) return true;
		return false;
	}
}
