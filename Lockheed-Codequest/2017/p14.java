import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class p14 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int things = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Product> tl = new ArrayList<>();
		Product top = new Product("");
		
		TreeMap<String,Product> map = new TreeMap<>();
		
		for (int i = 0; i < things; i++) {
			String[] spl = sc.nextLine().split(",");
			
			String name = spl[0];
			String par = spl[1];
			
			if (par.equals("None")) {
				Product p = new Product(name);
				top.addChild(p);
				map.put(name, p);
			}else {
				Product p  =new Product(name);
				map.put(name,p);
				map.get(par).addChild(p);
			}
			
		}
		
		String s = top.print(0);
		s = s.substring(1);
		out.print(s);
		out.close();
	}

}

class Product implements Comparable<Product>{
	
	String name;
	ArrayList<Product> children;
	
	public Product(String name) {
		this.name = name;
		children = new ArrayList<>();
	}
	
	public void addChild(Product p) {
		children.add(p);
		
		Collections.sort(children);
	}

    @Override
    public int compareTo(Product otherNode) {
        return this.name.compareTo(otherNode.name);
    }
	public String print(int deep) {
		String ret = "";
		for (int i =0 ; i < deep-1; i++) {
			ret += "-";
		}
		
		ret += name +"\n";
		
		Collections.sort(children);
		
		for (Product p : children) {
			ret +=p.print(deep+1);
		}
		return ret;
		
	}
	
}

/*

12
All Products,None
Space Products,All Products
Aeronautic Products,All Products
Satellites,Space Products
GPS,Satellites
A2100,Satellites
Manned Spacecraft,Space Products
Orion,Manned Spacecraft
Fighter Planes,Aeronautic Products
F-35 Lightning 2,Fighter Planes
F-22 Raptor,Fighter Planes
aa,All Products

*/