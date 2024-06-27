package inter;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Pro {

	public static void main(String[] args) {
		char[]ch= {'a','c','b','d'};
		HashMap<Integer, Character>map=new HashMap<Integer, Character>();
		for(int i=0;i<ch.length;i++) {
			map.put(i, ch[i]);
		}
		TreeSet<Character>sort2=new TreeSet<Character>();
		
	      for(Entry<Integer, Character> k:map.entrySet()) {
	    	  sort2.add(k.getValue());
	      }
	      System.out.print(sort2+" ");
	      
	}
}