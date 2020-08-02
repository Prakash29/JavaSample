package CorejavaSample;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapConcept 
{

	public static void main(String[] args) 
	{
	 Map mp=new HashMap();
	 
	 mp.put(1, "pms");
	 mp.put(2, "pmsm");
	 
	 Set st=mp.entrySet();
	 Iterator itr=st.iterator();
	 while (itr.hasNext())
	 {
		// System.out.println(mp.get(2));
		 Map.Entry entry=(Map.Entry)itr.next();  
		 System.out.println(entry.getKey());
		 System.out.println(entry.getValue());
	 }
	
	
}
}