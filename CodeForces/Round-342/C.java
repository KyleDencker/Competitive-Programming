import java.util.Scanner;

//David Gravett

public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[][] map = new int[n][n];

		int counter = (n*n)-(n-k);
		int num = 0;
		for(int i = n-1; i >= 0; i--){
			num += counter;
			
			map[i][k-1] = counter;
			counter -= n-k+1;
		}
		System.out.println(num);
		int count = 1;
		for(int i = 0; i < n; i++){
			for(int s = k; s < n; s++){			
				map[i][s] = map[i][s-1] + 1;						
			}

		}
		for(int i = 0; i < n; i++){
			for(int s = 0; s < k - 1; s++){			
				map[i][s] = count;	
				count++;
			}	
		}
		for(int i = 0; i < n; i++){
			for(int s = 0; s < n; s++){		
				if(s!= n-1){
					System.out.print(map[i][s] + " ");			
				}else{
					System.out.print(map[i][s]);
				}
			}
			System.out.println();

		}
	}

}
