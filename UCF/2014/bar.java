import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2014
//Problem: Bar

public class bar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			boolean Alosing = false;
			boolean Blosing = false;
			int count = 0;
			int[] a = new int[n];
			int[] b = new int[n];
			for(int j = 0; j < n; j++){
				a[j] = scan.nextInt();
			}
			for(int j = 0; j < n; j++){
				b[j] = scan.nextInt();
			}
			for(int j = 0; j < n; j++){
				if(!Alosing && !Blosing){
					if(a[j] > b[j]) Blosing = true;
					else if(b[j] > a[j]) Alosing = true;
				}
				else if(Blosing && b[j] > a[j]){
					Alosing = true;
					Blosing = false;
					count++;
				}
				else if(Alosing && a[j] > b[j]){
					Alosing = false;
					Blosing = true;
					count++;
				}
			}
			System.out.println("Video #"+i+": "+count);
		}
	}
}
