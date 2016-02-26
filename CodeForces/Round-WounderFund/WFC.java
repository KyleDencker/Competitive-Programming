import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class WFC {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int points = Integer.parseInt(stdin.readLine());
		ArrayList<Point> listOfPoints = new ArrayList<Point>();
		int order = 1;
		for (int i=0; i<points; i++) {
			StringTokenizer tokens = new StringTokenizer(stdin.readLine());
			listOfPoints.add(new Point(Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken()), order));
			order++;
		}
		Collections.sort(listOfPoints);
		int x = listOfPoints.get(0).x;
		boolean twoX = false;
		boolean two = false;
		String answer;
		answer = listOfPoints.get(0).order + " ";

		for (int i=1; i<listOfPoints.size(); i++) {
			if (x == listOfPoints.get(i).x) {
				if (twoX) {
					continue;
				} else {
					twoX = true;
					two = true;
					answer += listOfPoints.get(i).order + " ";
					continue;
				}
			}
			
			if (two==true) {
				out.println(answer+listOfPoints.get(i).order);
				out.flush();
				out.close();
				return;
			} else {
				two = true;
				answer += listOfPoints.get(i).order + " ";
			}
			
		}

	}
	
	public static float sign (Point p1, Point p2, Point p3){
	    return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);
	}

	public static Boolean PointInTriangle (Point pt, Point v1, Point v2, Point v3)
	{
		Boolean b1, b2, b3;

	    b1 = sign(pt, v1, v2) <= 0.0f;
	    b2 = sign(pt, v2, v3) <= 0.0f;
	    b3 = sign(pt, v3, v1) <= 0.0f;

	    return ((b1 == b2) && (b2 == b3));
	}

}

class Point implements Comparable<Point> {
	int x; 
	int y;
	int order;
	
	public Point(int x, int y, int o) {
		this.x = x;
		this.y = y;
		this.order = o;
	}

	@Override
	public int compareTo(Point e) {
		if (e.x == this.x) {
			return e.y - this.y;
		}
		return (e.x - this.x);
	}
}
