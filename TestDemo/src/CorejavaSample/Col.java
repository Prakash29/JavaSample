package CorejavaSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Col {


	public static void main(String[] args) {
		HashSet hs=new HashSet();
//hs.add(23);
//hs.add(40);
//hs.add(123);
//hs.add(430);
	System.out.println(hs);
	hs.add("pr");
	hs.add("adsf");
	hs.add("psr");
	hs.add("addsf");
	hs.add("pr");
	
	System.out.println(hs);
	
	TreeSet ts=new TreeSet();
	ts.add(2888);
	ts.add(22);
	ts.add(52);
	ts.add(82);
	ts.add(22);
	System.out.println(ts);
	
	LinkedHashSet l=new LinkedHashSet();
	l.add(2888);
	l.add(22);
	l.add(52);
	l.add(82);
	l.add(22);
	System.out.println(l);
	
	
	}

}
