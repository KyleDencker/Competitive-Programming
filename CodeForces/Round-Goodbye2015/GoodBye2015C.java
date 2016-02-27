import java.util.Scanner;


public class GoodBye2015C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.nextLine();
		char[][] map = new char[x][y];
		for (int i=0; i<x; i++) {
			map[i] = scan.nextLine().toCharArray();
		}
		int runs = scan.nextInt();
		for (int i=0; i<runs; i++) {
			int x1 = scan.nextInt()-1;
			int y1 = scan.nextInt()-1;
			int x2 = scan.nextInt()-1;
			int y2 = scan.nextInt()-1;
			
			for(int j=x1; j<=x2; j++) {
				for (int k = y1; k < y2; k++) {
					if (map[j][k] == '.' && map[j][k+1] == '.')  {
						answer++;
						answer %= 1000000007;
					}
				}
			}
			//System.out.println("Answer:" +answer);
			for(int j=y1; j<=y2; j++) {
				for (int k = x1; k < x2; k++) {
					if (map[k][j] == '.' && map[k+1][j] == '.')  {
						answer++;
						answer %= 1000000007;
					}
				}
			}
			System.out.println(answer);
			answer = 0;
		}
	}

}