package CorejavaSample;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class datereplace {

	public static void main(String[] args)
	{
      String str="the day of 29-july-2019 is my birthday";
      
      System.out.println("original " +str);
      
      /*Date dt=new Date();
      
      SimpleDateFormat dm=new SimpleDateFormat("dd/MM/yyyy");
   String   tb= dm.format(dt);*/
    
   
   LocalDate dt2=LocalDate.now();
   
   LocalTime tm=LocalTime.now();
   System.out.println(tm);
   System.out.println(dt2);
     
      
      String str1="the day of ";
      
      String str3="is my birthday";
      
      
      
     System.out.println(str1+dt2+ str3);
      

	}

}
