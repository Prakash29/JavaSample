package CorejavaSample;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class collectiondemo1 {

	public static void main(String[] args) 
	{
	
		// Arraylist programme
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("prakas");
		al.add("pms");
		al.add("pms");
		al.add("smsmsmsm");
        System.out.println(al);

		Iterator its = al.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
       for(int i=0;i<al.size();i++)
       {
    	System.out.println(i);   
       }
		
		
		
		//LinkedList
		
		LinkedList<String> al2=new LinkedList<String>();
		al2.add("new");
		al2.add("new22");
		al2.add("new");
		System.out.println(al2);
		
		Iterator itr=al2.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//Priorityque generate fifo maner print 
		PriorityQueue<String>pl=new PriorityQueue();
		pl.add("aaaa");
		pl.add("aaa");
		pl.add("abbb");
		pl.add("baab");
		pl.add("bccb");
		System.out.println(pl);
		pl.remove("bccb");
		
		Iterator itr1=pl.iterator();
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
			
	
		}
		//hashset remove duplicated elemnet
		HashSet<String>dm=new HashSet<String>();
		try{
			
	
		dm.add("abc");
		dm.add("bcc");
		dm.add("abc");
		
		Iterator <String>l=dm.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
		//vector 
		Vector<String> vt=new Vector();
		vt.add("Prakash");
		vt.add("pms");
		
		
		Iterator<String>vl=vt.iterator();
		
		while(vl.hasNext())
		{
			System.out.println(vl.next());
		}
		
}

}