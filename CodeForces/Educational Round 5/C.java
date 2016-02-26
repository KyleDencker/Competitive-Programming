import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;

//Ahmad Barhamje

public class C {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] split = f.readLine().split(" ");
		int x = Integer.parseInt(split[0]), y = Integer.parseInt(split[1]);
		char[][] grid = new char[x][y];
		int[][] size = new int[x][y], component = new int[x][y];
		for(int i = 0; i < x; i++) {
			grid[i] = f.readLine().toCharArray();
		}
		ArrayDeque<Integer> list = new ArrayDeque<Integer>(), addSize = new ArrayDeque<Integer>();
		int curComp = 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(grid[i][j] == '.') {
					list.addLast(i);
					list.addLast(j);
					addSize.addLast(i);
					addSize.addLast(j);
					int sC = 1;
					while(!list.isEmpty()) {
						int X = list.poll(), Y = list.poll();
						grid[X][Y] = '_';
						component[X][Y] = curComp;
						if(inBounds(X+1, x) && grid[X+1][Y] == '.') {
							sC++;
							grid[X+1][Y] = '_';
							component[X+1][Y] = curComp;
							list.addLast(X+1);
							list.addLast(Y);
							addSize.addLast(X+1);
							addSize.addLast(Y);
						}
						if(inBounds(X-1, x) && grid[X-1][Y] == '.') {
							sC++;
							grid[X-1][Y] = '_';
							component[X-1][Y] = curComp;
							list.addLast(X-1);
							list.addLast(Y);
							addSize.addLast(X-1);
							addSize.addLast(Y);
						}
						if(inBounds(Y+1, y) && grid[X][Y+1] == '.') {
							sC++;
							grid[X][Y+1] = '_';
							component[X][Y+1] = curComp;
							list.addLast(X);
							list.addLast(Y+1);
							addSize.addLast(X);
							addSize.addLast(Y+1);
						}
						if(inBounds(Y-1, y) && grid[X][Y-1] == '.') {
							sC++;
							grid[X][Y-1] = '_';
							component[X][Y-1] = curComp;
							list.addLast(X);
							list.addLast(Y-1);
							addSize.addLast(X);
							addSize.addLast(Y-1);
						}
					}
					while(!addSize.isEmpty()) {
						size[addSize.pollFirst()][addSize.pollFirst()] = sC;
					}
					curComp++;
				}
			}
		}
		for(int i = 0; i < x; i++) {
			StringBuilder a = new StringBuilder("");
			for(int j = 0; j < y; j++) {
				
				ArrayDeque<Integer> used = new ArrayDeque<Integer>();
				int val = 1;
				if(grid[i][j] == '*') {
					if(inBounds(i+1, x) && size[i+1][j] > 0 && !used.contains(component[i+1][j])) {
						val += size[i+1][j];
						used.addLast(component[i+1][j]);
					}
					if(inBounds(i-1, x) && size[i-1][j] > 0 && !used.contains(component[i-1][j])) {
						val += size[i-1][j];
						used.addLast(component[i-1][j]);
					}
					if(inBounds(j+1, y) && size[i][j+1] > 0 && !used.contains(component[i][j+1])) {
						val += size[i][j+1];
						used.addLast(component[i][j+1]);
					}
					if(inBounds(j-1, y) && size[i][j-1] > 0 && !used.contains(component[i][j-1])) {
						val += size[i][j-1];
						used.addLast(component[i][j-1]);
					}
					a.append(val%10);
				} else {
					a.append('.');
				}
			}
			out.println(a);
		}
		out.close();
	}
	
	public static boolean inBounds(int change, int bound) {
		if(change >= 0 && change < bound) return true;
		return false;
	}
}
