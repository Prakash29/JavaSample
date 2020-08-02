package CorejavaSample;
import java.util.Scanner;

public class oddeven 
{

	public static void main( String args[])
	{
		int n;
		
		System.out.println("enter a num");
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		
		if(n%2==0)
		{
			System.out.println("given number is even");
		}
	else
	{
		System.out.println("number is odd");
	}
}
	
}
