package CorejavaSample;

import java.util.Scanner;

public class StringRev {



	public static void main(String[] args)
	{
	 String str="prakash";
	 String rev="";
	 System.out.println(str.length());
	 
	 str.charAt(0);
	 str.compareTo("Pms");
	 
	 for(int i=str.length()-1;i>=0;i--)
	 {
		rev=rev+str.charAt(i);
	 
	 }
		System.out.println(rev);
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num");
		
		sc.hasNext();
	}

}
