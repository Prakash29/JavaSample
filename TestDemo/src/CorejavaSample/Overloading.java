package CorejavaSample;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Overloading {
	
	public int add(int a,int b)
	{
		return a+b;
		
		
	}
	
	public double add(int a,int b,double c)
	{
		return a+b+c;
		
	}
	public static void main(String[] args) 
	{
		
		Overloading obj=new Overloading();
		
	
		
System.out.println(obj.add(10, 20));


System.out.println(obj.add(10, 20, 110.11));
	}

}
