import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class WFC {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int points = Integer.parseInt(stdin.readLine());
		ArrayList<Point> listOfPoints = new ArrayList<Point>();
		int order = 2;
		StringTokenizer tokens = new StringTokenizer(stdin.readLine());
		Point orgin = new Point(Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken()), 1, null);
		for (int i=1; i<points; i++) {
			tokens = new StringTokenizer(stdin.readLine());
			listOfPoints.add(new Point(Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken()), order, orgin));
			order++;
		}
		Collections.sort(listOfPoints);
		ArrayList<Point> answer = new ArrayList<Point>();
		answer.add(orgin);
		for (int i=0; i<listOfPoints.size(); i++) {
			if (listOfPoints.get(i).x != orgin.x) {
				answer.add(listOfPoints.get(i));
				listOfPoints.remove(i);
				break;
			}
		}
		
		// ax+by+c = 0
		// y = m * x + c
		// m = a / b;
		// a = y1 - y2
		// b = x1 - x2
		// c = y - mx ;
		int a = answer.get(0).y - answer.get(1).y;
		int b = answer.get(0).x - answer.get(1).x;
		double m = (double) a / b;
		double c = orgin.y - m * orgin.x; 
		
		for (int i=0; i<listOfPoints.size(); i++) {
			if (listOfPoints.get(i).y != m * listOfPoints.get(i).x + c) {
				answer.add(listOfPoints.get(i));
				break;
			}
		}
		
		for (int i=0; i<3; i++) {
			System.out.print(answer.get(i).order + " ");
		}




	}

}

class Point implements Comparable<Point> {
	int x; 
	int y;
	int order;
	BigInteger distance;

	public Point(int x, int y, int o, Point orgin) {
		this.x = x;
		this.y = y;
		this.order = o;
		if (orgin != null) {
			distance = distance(orgin);
			//System.out.println(order + " " + distance.toString());

		}
	}

	public BigInteger distance(Point o) {
		BigInteger deltaX = new BigInteger((o.x-this.x)+"");
		deltaX = deltaX.multiply(deltaX);
		BigInteger deltaY = new BigInteger((o.y-this.y)+"");
		deltaY = deltaY.multiply(deltaY);
		return deltaX.add(deltaY);
	}

	@Override
	public int compareTo(Point e) {
		return -1*e.distance.compareTo(this.distance);
	}
}