import java.util.HashSet;
import java.util.TreeSet;

import java.util.Iterator;

public class SetTest{
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		
		hs.add("Korea");
		ts.add("Korea");
		
		hs.add("LS");
		ts.add("LS");
		
		hs.add("AS");
		ts.add("AS");
		
		hs.add("Korea");
		ts.add("Korea");
		
		hs.add("Borea");
		ts.add("Borea");
		Iterator it1 = hs.iterator();
		Iterator it2 = ts.iterator();
		
		
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("-------------------------------------");
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
}