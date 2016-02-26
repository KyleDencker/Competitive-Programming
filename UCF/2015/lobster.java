import java.util.Arrays;
import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2015
//Problem: Swap Lobster

public class lobster {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			int l = scan.nextInt();
			int[] arr = new int[n];
			int[] sorted = new int[n];
			for(int j = 0; j < n; j++){
				arr[j] = scan.nextInt();
			}
			while(true){
				sorted = arr.clone();
				Arrays.sort(sorted);
				if(l == 1){ //An array can always be sorted if items are swapped by increments of 1.
					System.out.println("Lobster #"+i+": Sortable");
					break;
				}
				int max = 0;
				int maxpos = 0;
				//Determine where the max value is located in the array.
				for(int j = 0; j < arr.length; j++){
					if(arr[j] > max){
						max=arr[j];
						maxpos = j;
					}
				}
				//Move the max value as high up in the array as possible.
				while(maxpos < arr.length-l){
					int temp = arr[maxpos+l];
					arr[maxpos+l] = arr[maxpos];
					arr[maxpos] = temp;
					maxpos+=l;
				}
				//Is the max value bigger than the next value?
				//If it can't go any further in the array but it's not at
				//the last spot, then it's unsortable.
				if(maxpos != arr.length && arr[arr.length-1] != arr[maxpos]){
					System.out.println("Lobster #"+i+": Unsortable");
					break;
				}
				//If the array is sorted succesfully, it is sortable.
				if(Arrays.equals(arr, sorted)){
					System.out.println("Lobster #"+i+": Sortable");
					break;
				}
				else{
					//Remove the max value and sort the array again
					//with the next max value.
					if(arr.length!=0){
						int[] rep = new int[arr.length-1];
						for(int k = 0; k < rep.length; k++){
							rep[k] = arr[k];
						}
						arr = rep.clone();
					}
					else { // Runtime exception failsafe.
						System.out.println("Lobster #"+i+": Sortable");
						break;
					}
				}
			}
		}
	}
}
