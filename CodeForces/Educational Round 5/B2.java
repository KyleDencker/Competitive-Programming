import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class B2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String a=scan.readLine();
		String b=scan.readLine();
		int lz=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='0'){
				lz++;
			}else{
				break;	
			}
		}
		a=a.substring(lz);
		lz=0;
		for(int i=0;i<b.length();i++){
			if(b.charAt(i)=='0'){
				lz++;
			}else{
				break;
			}
		}
		b=b.substring(lz);
		if(a.length()>b.length()){
			System.out.println(">");
		}else if(b.length()>a.length()){
			System.out.println("<");
		}else{
			boolean br=false;
			for(int i=0;i<a.length();i++){
				if(Character.getNumericValue(a.charAt(i))>Character.getNumericValue(b.charAt(i))){
					System.out.println(">");
					br=true;
					break;
				}else if(Character.getNumericValue(a.charAt(i))<Character.getNumericValue(b.charAt(i))){
					System.out.println("<");
					br=true;
					break;
				}
			}
			if(!br){
				System.out.println("=");
			}
		}
		
	}

}