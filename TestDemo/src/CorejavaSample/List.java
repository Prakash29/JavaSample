package CorejavaSample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
	int aa[]={1,11,111,};
		ArrayList<String> al = new ArrayList();
		
		al.add("poi");
		al.add("poi");
		al.add("ajs");
		al.add("xbxn");
	/*	System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al.toString());*/
		for(String a:al){
			System.out.println(a);
		}
		
		 LinkedList ll=new LinkedList();
		 ll.add("poi");
			ll.add("poi");
			ll.add("ajs");
			ll.add("xbxn");
			System.out.println(ll);
			HashSet hs=new HashSet();
			hs.add(aa);
			
			System.out.println(hs.toString() );
	}

	@Override
	public String toString() {
		return "List []";
	}

}
