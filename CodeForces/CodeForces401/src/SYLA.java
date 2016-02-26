import java.util.ArrayList;
import java.util.Scanner;

public class SYLA {
	public static void main(String[] args){
		ArrayList<String> z=new ArrayList<String>();
		Scanner x=new Scanner(System.in);
		String m=x.nextLine();
		while(!m.equals("0")){
			String[] a=m.split("");
			z.add("Digital Root: "+digRoot(a));
			m=x.nextLine();
		}
		for(String c: z){
			System.out.println(c);
		}
	}
	public static int digRoot(String[] n){
		int sum=0;
		for(String s: n){
			sum+=Integer.parseInt(s);
		}
		if(sum>0 && sum<=9)
			return sum;
		String v=""+sum;
		String[] quirk=v.split("");
		return digRoot(quirk);
	}
}
