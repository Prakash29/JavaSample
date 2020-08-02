package CorejavaSample;
import java.util.Date;

public class Varriable {

	static int a=12;
	int b=13;
	final  int c=14;
	
	
private	static void add()
	{
		
		System.out.println(" accsessed");
	}
	
	public static void main(String[] args)
	{
		a=15;
		System.out.println(Varriable.a);
		Varriable.add();
		Varriable v=new Varriable();
	//b=17;
		System.out.println(v.b);
		System.out.println(v.c);
		Date d=new Date();
		v.add();
	System.out.println(d);
	}
	
}
