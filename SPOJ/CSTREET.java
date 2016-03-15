import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// Kyle Dencker
// Prims Algrothim 
// March 14, 2016

public class CSTREET {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int runs = scan.nextInt();
		
		for (int i=0; i<runs; i++) {
			
			int p = scan.nextInt();
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			
			boolean[] used = new boolean[n];
			ArrayList<Edge>[] nodes = new ArrayList[n];
			for (int j=0; j<n; j++) {
				used[j] = false;
				nodes[j] = new ArrayList<Edge>();
			}
			
			for (int j=0; j<m; j++) {
				int a = scan.nextInt()-1;
				int b = scan.nextInt()-1;
				int c = scan.nextInt();
				
				nodes[a].add(new Edge(a, b, c));
				nodes[b].add(new Edge(b, a, c));
			}
			
			PriorityQueue<Edge> pq = new PriorityQueue();
			
			// Select the first node.
			used[0] = true;
			pq.addAll(nodes[0]);
			int answer = 0;
			//System.out.println(pq);
			
			while (!pq.isEmpty()) {
				Edge current = pq.poll();
				
				// Is this a path were we have never been to?
				if (used[current.to]) continue;
				
				answer += current.cost;
				used[current.to] = true;
				
				pq.addAll(nodes[current.to]);
				
			}
			System.out.println(answer*p);
			
			
		}
	}

}

class Edge implements Comparable<Edge>{
	
	int to, from, cost;
	
	public Edge(int f, int t, int c) {
		this.from = f;
		this.to = t;
		this.cost = c;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
	
	public String toString() {
		return "To: "+to+" From: " + from + "\n";
	}
}