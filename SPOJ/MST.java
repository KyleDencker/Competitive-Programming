import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {

	public static void main(String[] args) throws IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String[] ins = bu.readLine().split(" ");
		
		int nodes = Integer.parseInt(ins[0]);
		int edges = Integer.parseInt(ins[1]);
		
		boolean[] visited = new boolean[edges];
		ArrayList<MSTEdge>[] array = new ArrayList[edges];
		
		for (int i = 0; i < edges; i++) {
			array[i] = new ArrayList<MSTEdge>();
		}
		
		for (int i = 0; i < edges; i++) {
			ins = bu.readLine().split(" ");
			MSTEdge n = new MSTEdge(Integer.parseInt(ins[0])-1, Integer.parseInt(ins[1])-1, Integer.parseInt(ins[2]));
			MSTEdge n2 = new MSTEdge(n.end, n.start, n.weight);
			array[n.start].add(n); 
			array[n.end].add(n2);
		}
		
		int ans = 0;
		
		PriorityQueue<MSTEdge> pq = new PriorityQueue<MSTEdge>();
		
		pq.addAll(array[0]);
		visited[0] = true;
		
		while (!pq.isEmpty()) {
			MSTEdge e = pq.poll();
			
			if (visited[e.end]) continue;
			
			ans += e.weight;
			pq.addAll(array[e.end]);
			visited[e.end] = true;
		}
		
		
		out.print(ans);
		out.close();

	}

}

class MSTEdge implements Comparable<MSTEdge> {
	int start, end, weight;

	public MSTEdge(int s, int e, int w) {
		start = s;
		end = e;
		weight = w;
	}
	
	@Override
	public int compareTo(MSTEdge arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
