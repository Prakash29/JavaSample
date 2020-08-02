package CorejavaSample;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) 
	{
	int year;
	System.out.println("enter year");

	 Scanner y= new Scanner(System.in);
	 
   year=y.nextInt();
   
   y.close();
   
   if(year%4==0)
   {
	   System.out.println("year is leap");
   
	}
   else {
	   System.out.println("not leap");
	   
   }
   }

}
