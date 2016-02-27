import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class C339COthers {

   static class Pair{
       long first;
       long second;
       public Pair(){
           this.first = 0;
           this.second = 0;
       }
   }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
        
        String[] in = br.readLine().split(" ");
        
        int n = Integer.parseInt(in[0]);
        int x1 = Integer.parseInt(in[1]);
        int y1 = Integer.parseInt(in[2]);
        int x2 = Integer.parseInt(in[3]);
        int y2 = Integer.parseInt(in[4]);
        
        ArrayList<Pair> A = new ArrayList<>(n+1);
        for(int i = 0;i<=n;i++){
            A.add(new Pair());
        }
        
        for(int i=0;i<n;i++){
            in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            A.get(i).first = 1L*(x-x1)*(x-x1)+1L*(y-y1)*(y-y1);
            A.get(i).second = 1L*(x-x2)*(x-x2)+1L*(y-y2)*(y-y2);
        }
        
        long max = Long.MAX_VALUE;
        
        for(Pair pair : A){
            
            long r1 = pair.first;
            long r2 = 0;
            
            for(Pair s : A ){
                if(s.first > r1){
                    r2 = Math.max(r2, s.second);
                    System.out.println(s.first + " " +pair.first);
                }
            }
            
            max = Math.min(max, r1+r2);
        }
        System.out.println(max);
        
        
    }

}