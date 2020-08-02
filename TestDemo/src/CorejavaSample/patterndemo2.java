package CorejavaSample;

import java.util.Scanner;

public class patterndemo2 {

	public static void main(String[] args) 
	{
	    int r;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter how manu row ");
		r=sc.nextInt();
		
		for (int i=0;i<=r;i++)
		{
			for(int j=i;j<=i;j++)
			{
				System.out.print(i);
			}
		}
		

	}

}
