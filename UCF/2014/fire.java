import java.io.File;
import java.util.Scanner;

// Brett Fazio
// UCF In-Person Competition 2014
// Problem Fire, 1 solve during competition.

public class fire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

    // Scan in our array using .toCharArray() (make writing a lot faster)
		for (int a = 0; a < m; a++) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			sc.nextLine();
			char[][] array = new char[h][w];

			for (int i = 0; i < h; i++) {
				array[i] = sc.nextLine().toCharArray();
			}

			for (int hh = 0; hh < h; hh++) {
				for (int ww = 0; ww < w; ww++) {
					char c = array[hh][ww];
					// Depending on which type of dragon it is 
					// changes our fire direction
					if (c == '>') {
						array = fillright(array, hh, ww);
					}else if (c == '<') {
						array = fillleft(array,hh,ww);
					}else if (c == '^') {
						array = fillup(array,hh,ww);
					}else if (c == 'V') {
						array = filldown(array,hh,ww);
					}
				}
			}

			System.out.println("Map #" + (a+1) + ":");
			for (int i = 0; i < array.length; i++) {
				for (int q = 0; q < array[i].length; q++) {
					System.out.print(array[i][q]);
				}
				System.out.println();
			}
			System.out.println();

		}

	}

	public static boolean inBounds(char[][] in, int h, int w) {
		return h >= 0 && h < in.length && w >= 0 && w < in[0].length;
	}

	public static char[][] fillright(char[][] in, int h, int w) {

		for (int loc = w + 1; loc < in[h].length; loc++) {
			if (in[h][loc] == '.' || in[h][loc] == 'F' || in[h][loc] == 'F') {
				in[h][loc] = 'F';
			} else {
				break;
			}
		}

		int lh = h + 1, lw = w + 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lw + 1; loc < in[lh].length; loc++) {
					if (in[lh][loc] == '.' || in[lh][loc] == 'F' || in[lh][loc] == 'F') {
						in[lh][loc] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh++;
			lw++;
		}

		lh = h - 1;
		lw = w + 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lw + 1; loc < in[lh].length; loc++) {
					if (in[lh][loc] == '.' || in[lh][loc] == 'F' || in[lh][loc] == 'F') {
						in[lh][loc] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh--;
			lw++;
		}

		/*
		 * for (int i = 0; i < in.length; i++) { for (int q = 0; q <
		 * in[i].length; q++) { System.out.print(in[i][q]); }
		 * System.out.println(); }
		 */

		return in;
	}

	public static char[][] fillleft(char[][] in, int h, int w) {

		for (int loc = w - 1; loc >= 0; loc--) {
			if (in[h][loc] == '.' || in[h][loc] == 'F' || in[h][loc] == 'F') {
				in[h][loc] = 'F';
			} else {
				break;
			}
		}

		int lh = h + 1, lw = w - 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lw - 1; loc >= 0; loc--) {
					if (in[lh][loc] == '.' || in[lh][loc] == 'F' || in[lh][loc] == 'F') {
						in[lh][loc] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh++;
			lw--;
		}

		lh = h - 1;
		lw = w - 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lw - 1; loc >= 0; loc--) {
					if (in[lh][loc] == '.' || in[lh][loc] == 'F' || in[lh][loc] == 'F') {
						in[lh][loc] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh--;
			lw--;
		}

		/*
		 * for (int i = 0; i < in.length; i++) { for (int q = 0; q <
		 * in[i].length; q++) { System.out.print(in[i][q]); }
		 * System.out.println(); }
		 */

		return in;
	}

	public static char[][] fillup(char[][] in, int h, int w) {

		for (int loc = h - 1; loc >= 0; loc--) {
			if (in[loc][w] == '.' || in[loc][w] == 'F' || in[loc][w] == 'F') {
				in[loc][w] = 'F';
			} else {
				break;
			}
		}

		int lh = h - 1, lw = w + 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lh - 1; loc >= 0; loc--) {
					if (in[loc][lw] == '.' || in[loc][lw] == 'F' || in[loc][lw] == 'F') {
						in[loc][lw] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh--;
			lw++;
		}

		lh = h - 1;
		lw = w - 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lh - 1; loc >= 0; loc--) {
					if (in[loc][lw] == '.' || in[loc][lw] == 'F' || in[loc][lw] == 'F') {
						in[loc][lw] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh--;
			lw--;
		}

		return in;
	}

	public static char[][] filldown(char[][] in, int h, int w) {

		for (int loc = h + 1; loc < in.length; loc++) {
			if (in[loc][w] == '.' || in[loc][w] == 'F' || in[loc][w] == 'F') {
				in[loc][w] = 'F';
			} else {
				break;
			}
		}

		int lh = h + 1, lw = w + 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lh + 1; loc < in.length; loc++) {
					if (in[loc][lw] == '.' || in[loc][lw] == 'F' || in[loc][lw] == 'F') {
						in[loc][lw] = 'F';
					}else {
						break;
					}
				}
			}else {
				break;
			}

			lh++;
			lw++;
		}

		lh = h + 1;
		lw = w - 1;
		while (inBounds(in, lh, lw)) {
			if (in[lh][lw] == '.' || in[lh][lw] == 'F' || in[lh][lw] == 'F') {
				in[lh][lw] = 'F';
				for (int loc = lh + 1; loc < in.length; loc++) {
					if (in[loc][lw] == '.' || in[loc][lw] == 'F' || in[loc][lw] == 'F') {
						in[loc][lw] = 'F';
					}else {
						break;
					}
				}
			} else {
				break;
			}

			lh++;
			lw--;
		}

		return in;
	}

}
