import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Sharon Barak
//Code for UCF High School Programming Tournament 2012
//Problem: Batarang

public class batarang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			ArrayList<Point> villians = new ArrayList<Point>();
			int n = scan.nextInt();
			int count = n;
			for(int j = 0; j < n; j++){
				villians.add(new Point(scan.nextInt(), scan.nextInt()));
			}
			// sort things by x, negative x values are in the left quadrant, positive are in the right.
			Collections.sort(villians);
			int index = 0;
			// find where things will be in the right quadrant
			for(int j = 0; j < n; j++){
				if(villians.get(j).x > 0){
					index = j;
					break;
				}
			}
			// check left quadrants
			for(int j = 0; j < index; j++){
				for(int k = j+1; k < index; k++){
					//if two villians have the same slope and are in the same
					//side of the room (left or right) then they are on the same
					//line and a boomerang will get rid all of the people in the
					//line
					double slope1 = villians.get(j).y / villians.get(j).x;
					double slope2 = villians.get(k).y / villians.get(k).x;
					if(slope1 == slope2 && villians.get(k).wasShot == false){
						villians.get(j).wasShot = true;
						villians.get(k).wasShot = true;
						count--;
						//every time two villians get shot at the same time,
						//you can save a boomerang
					}
				}
				if(villians.get(j).wasShot= false){
					villians.get(j).wasShot = true;
				}
			}
			// check right quadrants
			// repeat same thing
			for(int j = index; j < villians.size(); j++){
				for(int k = j+1; k < villians.size(); k++){
					double slope1 = villians.get(j).y / villians.get(j).x;
					double slope2 = villians.get(k).y / villians.get(k).x;
					if(slope1 == slope2 && villians.get(k).wasShot == false){
						villians.get(j).wasShot = true;
						villians.get(k).wasShot = true;
						count--;
					}
				}
				if(villians.get(j).wasShot= false){
					villians.get(j).wasShot = true;
				}
			}
			if (count == 1) System.out.println("Room #"+i+" Leaping lizards, "+n+" birds with one stone");
			else System.out.println("Room #"+i+": Batman will only need "+count+" batarangs!");
		}
	}
}

class Point implements Comparable<Point>{
	
	//find the point where all villians are
	//also know if the villian was shot yet
	
	int x;
	int y;
	boolean wasShot;

	public Point(int x, int y){
		this.x = x;
		this.y = y;
		wasShot = false;
	}

	public int compareTo(Point arg0) {
		return this.x-arg0.x;
	}

}