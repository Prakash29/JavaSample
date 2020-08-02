package CorejavaSample;
public class strrevdemo
{


	public void fun()
	{
		String str="Prakash";
		
		String rev="";
		
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
			System.out.println(rev);
		}
		//System.out.println(rev);
		//System.out.println(rev.charAt(0));
		
	}
	public static void main(String str[])
	{
		strrevdemo obj =new strrevdemo();
		obj.fun();
		
	}


}
