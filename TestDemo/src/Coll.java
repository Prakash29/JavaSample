

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Coll {

	public static void main(String[] args) {
		
		
		ArrayList al =new ArrayList();
		al.add("aa");
		al.add("aa");
		al.add("c");
		al.add("dc");
		al.add("b");
		System.out.println(al);
		HashSet hs=new HashSet(al);
		hs.add(1);
		hs.add(2);
		System.out.println(hs);
TreeSet ts=new TreeSet(al);
ts.add("aaa");
ts.add("aca");
System.out.println(ts);
LinkedHashSet l=new LinkedHashSet(al);
System.out.println(al);

	}

}
