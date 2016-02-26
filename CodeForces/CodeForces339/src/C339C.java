	import java.util.ArrayList;
		import java.util.Scanner;
		
		// Kyle Dencker
		// CodeForces #339C
		// 1/23/2016
		
		public class C339C {
		
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				int numPoints = scan.nextInt();
				Point one = new Point(scan.nextInt(), scan.nextInt());
				Point two = new Point(scan.nextInt(), scan.nextInt());
				
				ArrayList<Point> list = new ArrayList<Point>();
				for (int i=0; i<numPoints; i++) {
					list.add(new Point(scan.nextInt(), scan.nextInt(), one, two));
				}
				
				list.add(new Point(0, 0));
				list.get(list.size()-1).d1 = 0;
				list.get(list.size()-1).d2 = 0;
				
				long answer = Long.MAX_VALUE;
				for (int i=0; i<list.size(); i++) {
					long r1 = list.get(i).d1;
					long r2 = 0;
					for (int j=0; j<list.size(); j++) {
						if (list.get(j).d1 > r1) {
							r2 = Math.max(r2, list.get(j).d2);
						}
					}
					
					answer = Math.min(answer, r1+r2);
				}
				
				
				System.out.println(answer);
				
			}
		
		}
		
		class Point {
			int x;
			int y;
			long d1=-1, d2=-1;
			
			public Point(int a, int b) {
				x = a;
				y = b;
			}
			
			public Point(int a, int b, Point c, Point d) {
				x = a;
				y = b;
				d1 = this.getDistance(c);
				d2 = this.getDistance(d);
				//System.out.println(this.toString());
				//System.out.println(c.toString());
			}
			
			public long getDistance(Point a) {
				//System.out.println(this.x - a.x);
				//System.out.println(a.x);
				return (1l*this.x - a.x)*(this.x-a.x) + (1l*this.y-a.y)*(this.y-a.y);
			}
			
			public String toString() {
				return "Point ("+x+", "+y+")\nDistance: "+d1+", "+d2;
			}
		}