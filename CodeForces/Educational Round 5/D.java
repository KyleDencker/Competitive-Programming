import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Ahmad Barhamje

public class D {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] split = f.readLine().split(" ");
		int n = Integer.parseInt(split[0]), k = Integer.parseInt(split[1]);
		int[] a = new int[n];
		split = f.readLine().split(" ");
		for(int i = 0; i < split.length; i++) {
			a[i] = Integer.parseInt(split[i]);
		}
		
		int l = 0, r = -1, c = 0;
		int len = 1, fL = 0, fR = 0;
		int[] freq = new int[1000001];
		
		for(int i = 0; i < n; i++) {
			boolean runs = false;
			if(c < k) { //can add more distinct numbers
				runs = true;
				if(freq[a[i]] == 0) { //is a distinct number
					freq[a[i]]++;
					c++;
					if(r+1 < n) {
						r++;
					}
				} else { //duplicate number
					freq[a[i]]++;
					if(r+1 < n) {
						r++;
					}
				}
			} 
			if(c == k || i == a.length-1){ //no more distinct numbers are available for use
				//count num of duplicates after last number
				while(r+1 < n && freq[a[r+1]] > 0) { 
					freq[a[r+1]]++;
					i++;
					r++;
				}
				int curLen = (r-l)+1;
				if(curLen > len) {
					len = curLen;
					fL = l; fR = r;
				}
				freq[a[l]]--;
				if(freq[a[l]] == 0) c--;
				l++;
				if(!runs) i--;
			}
		}
		out.println((fL+1) + " " + (fR+1));
		out.close();
	}
}
