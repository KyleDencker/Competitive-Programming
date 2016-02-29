import java.util.Scanner;

public class find {

	//Sharon Barak
	//Code for UCF High School Programming Tournament 2013
	//Problem: Find X

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= t; i++){
			int r = scan.nextInt();
			int c = scan.nextInt();
			scan.nextLine();
			char[][] grid = new char[r][c];
			for(int j = 0; j < r; j++){
				String input = scan.nextLine();
				for(int k = 0; k < c; k++){
					grid[j][k] = input.charAt(k);
				}
			}
			int ans = 0;
			for(int j = 0; j < r; j++){
				for(int k = 0; k < c; k++){
					if(grid[j][k] == 'X'){
						int topRight = 0;
						int topLeft = 0;
						int botRight = 0;
						int botLeft = 0;
						int x = k;
						int y = j;
						while(x > 0 && y > 0){
							x--;
							y--;
							if(grid[y][x] == 'X'){
								topLeft++;
							}
						}
						x = k;
						y = j;
						while(x > 0 && y < r-1){
							x--;
							y++;
							if(grid[y][x] == 'X'){
								botLeft++;
							}
						}
						x = k;
						y = j;
						while(x < c-1 && y > 0){
							x++;
							y--;
							if(grid[y][x] == 'X'){
								topRight++;
							}
						}
						x = k;
						y = j;
						while(x < c-1 && y < r-1){
							x++;
							y++;
							if(grid[y][x] == 'X'){
								botRight++;
							}
						}
						int maybe = Math.min(1+topLeft+botRight, 1+topRight+botLeft);
						if(maybe % 2 == 0) maybe--;
						if(ans < maybe) ans = maybe;
					}
				}
			}
			System.out.println("Page #"+i+": "+ans);
		}
	}
}
