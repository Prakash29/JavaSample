package CorejavaSample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args)
	{
	
 Date dt= new Date();
 System.out.println(dt);
 
 SimpleDateFormat sd=new SimpleDateFormat("dd/MM/YYYY");
 
 System.out.println(sd.format(dt));
 
	
	}
	
	

}
