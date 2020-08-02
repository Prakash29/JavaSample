package CorejavaSample;
public class demo222 
{
	
	public static void demo()
	{
		String str="Prakash";
		String rev="";
		
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}
	}
	
	public static void main(String args[])
	{
		demo();
		
	}
	
	
}
