// Brett Fazio
// SPOJ Problem MAKEMAZE

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MAKEMAZE {

	final static int[] dd = {0, 1, 0, -1};
	final static int[] da = {-1, 0, 1, 0};

	public static Point start;
	public static Point end;

	int d, a;

	public static void main(String[] args) throws Exception, IOException {
		//BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		//int runs = Integer.parseInt(bu.readLine());
		int runs = sc.nextInt();
		for (int i = 0; i < runs; i++) {
			start = new Point();
			end = new Point();
			start.d = -1;
			start.a = -1;
			end.d = -1;
			end.a = -1;
			//			String[] ins = bu.readLine().split(" ");
			//			int down = Integer.parseInt(ins[0]);
			//			int across = Integer.parseInt(ins[1]);

			int down = sc.nextInt();
			int across = sc.nextInt();
			sc.nextLine();

			char[][] array = new char[down][across];

			for (int a = 0; a < down; a++) {
				//array[a] = bu.readLine().replaceAll(" ", "").toCharArray();
				array[a] = sc.nextLine().replaceAll(" ", "").toCharArray();
			}

			boolean b = (countOutside(array) == 2);

			if (!b) {
				System.out.println("invalid");
				//System.out.println("here");
			}
			else {

				ArrayList<Point> bfs = new ArrayList<Point>();

				boolean found = false;

				bfs.add(start);
				array[start.d][start.a] = 'Z';
				while (bfs.isEmpty() == false) {
					//System.out.println("here");
					Point c = bfs.get(0);
					bfs.remove(0);

					if (c.d == end.d && c.a == end.a) {
						found = true;
						break;
					}

					//System.out.println(c.d + " " + c.a);
					for (int a = 0; a < 4; a++) {
						int nd = c.d+dd[a];
						int na = c.a+da[a];
						if (nd >= 0 && nd < down && na >= 0 && na < across) {

							if (array[nd][na] == '.') {
								Point n = new Point();
								n.d = nd;
								n.a = na;
								bfs.add(n);
								array[nd][na] = 'Z';
							}
						}
					}
				}



				//System.out.println(side.size());
				if (found) {
					System.out.println("valid");
				}else {
					System.out.println("invalid");
				}

			}

		}

	}

	public static int countOutside(char[][]in) {
		int c = 0;

		for (int d = 0; d < in.length; d++) {
			for (int a = 0; a < in[d].length; a++) {
				if (d == 0 || d == in.length-1 || a == 0 || a == in[d].length-1) {
					if (in[d][a] == '.') {
						c++;
						if (c== 3) break;
						if (start.d == -1) {
							start.d = d;
							start.a = a;
						}else {
							end.d = d;
							end.a = a;
						}
					}
				}
			}
		}


		return c;
	}

	/*
1
3 5
#.###
#.#.#
##.##
	 */

}

class Point {
	int d, a;
}
