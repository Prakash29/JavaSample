package CorejavaSample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Alist {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add("poi");
		al.add("poi");
		al.add("ajs");
		al.add("xbxn");
		System.out.println(al);
		

		HashSet hs = new HashSet(al);

		System.out.println(" without duplicates" + hs);
		
		 LinkedList ll=new LinkedList();
		// LinkedList lll=new LinkedList(al);
		 //System.out.println(lll);
		 ll.add( 13);
	 ll.add(12);
	ll.add(12);
		 ll.add(11);
		 System.out.println(ll);
		 TreeSet ts=new TreeSet(ll); 
		 System.out.println(ts);
		 System.out.println(al);
 
		 LinkedHashSet lhs=new LinkedHashSet(al);
 System.out.println(lhs);
System.out.println( lhs.toString());
	}
}
