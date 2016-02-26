import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class chief {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 1; i <= t; i++){
			int n = scan.nextInt();
			double r = scan.nextDouble();
			double ballVolume = (4/3)*Math.PI*r*r;
			ArrayList<Block> Blocks = new ArrayList<Block>();
			for(int j = 0; j < n; j++){
				Block b = new Block(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
				Blocks.add(b);
			}
			Collections.sort(Blocks);
			boolean possible = true;
			for(int j = 0; j < n; j++){
				if(r <= Blocks.get(i).h){
					System.out.println("Problem Set #"+i+": We need to rebuild this!");
					possible = false;
					break;
				}
				else{
					ballVolume += Blocks.get(i).vol;
					r = Math.sqrt(4*ballVolume/Math.PI*3);
				}
			}
			if(possible) System.out.println("Problem Set #"+i+": It's going to be a good set!");
		}
	}
}

class Block implements Comparable<Block>{
	
	double l;
	double w;
	double h;
	double vol;
	
	public Block(double l, double w, double h){
		this.l = l;
		this.w = w;
		this.h = h;
		this.vol = l*w*h;
	}

	public int compareTo(Block arg0) {
		return (int) (this.vol-arg0.vol);
	}
}