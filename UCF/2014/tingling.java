import java.io.*;
import java.text.DecimalFormat;

//Sharon Barak
//Code for UCF High School Programming Tournament 2014
//Problem: Tingling

public class tingling {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++){
			String[] in = br.readLine().split(" ");
			String ID = in[0];
			double area = Double.parseDouble(in[1])*Double.parseDouble(in[1]);
			double ans = Math.sqrt(area/Math.PI);
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(ID+" is "+df.format(ans)+" feet away.");
		}
		out.println("");
		out.close();
	}
}
