import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeMap;

public class cf975c {

	static int warriors, minutes;
	static long[] a;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String[] br = bu.readLine().split(" ");
		
		warriors = Integer.parseInt(br[0]);
		minutes = Integer.parseInt(br[1]);
		
		a = new long[warriors];
		
		
		br = bu.readLine().split(" ");
		for (int i= 0; i < warriors; i++) {
			a[i] = Long.parseLong(br[i]);
		}
		
		TreeMap<Long,Integer> map = new TreeMap<>();
		
		long sum = 0;
		
		for (int i =0 ; i < warriors; i++) {
			sum += a[i];
			map.put(sum, i+1);
		}
		
	
		map.put(Long.MAX_VALUE, Integer.MAX_VALUE);
		br = bu.readLine().split(" ");
		
		long cur = 0;
		for (int i =0 ; i < minutes; i++) {
			
			long shoot = Long.parseLong(br[i]);
//			System.out.println("cur+shoot = " + (cur+shoot) + " shoot = " + shoot);
			long getkey = map.higherKey(cur+shoot);
					
			int get = map.get(getkey);
			
			if (get == Integer.MAX_VALUE) {
				out.println(warriors);
				cur = 0;
				continue;
			}
			
			cur = cur+shoot;
			
//			System.out.println(get);
			
			out.println((warriors-(get)+1));
			
		}
	
		
		out.close();
	}

}
