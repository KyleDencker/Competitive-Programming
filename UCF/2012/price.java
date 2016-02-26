import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Batarang

public class price {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			int[] prices = new int[1000001];
			for(int j = 0; j < n; j++){
				prices[scan.nextInt()]++;
			}
			int max = 0;
            for(int j = 0; j < 1000001;j++){
                if(prices[j] > max){
                    max = prices[j];
                }
            }
            for(int j = 0; j < 1000001;j++){
                if(prices[j] == max){
                    System.out.println("Item #"+i+": Most likely price is "+j+" cents.");
                }
            }
		}
	}
}
