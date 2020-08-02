package CorejavaSample;
public class PalindromNum 
{
public static void main(String arg[])
{   int i;
	String num="123";
	String rev="";
	
	for( i=num.length()-1;i>=0;i--)
	{
		
	rev=rev+num.charAt(i);
	
	System.out.println(rev);
		
	}
	if(rev.equals(num))
	{
	System.out.println("num is palindrom");
	}
	else
	{
   System.out.println("no is not palindrom");
	}
}
}

