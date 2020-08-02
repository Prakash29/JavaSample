package CorejavaSample;


public class ArrayDemo
{
	public static void main (String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		
		for (int element: a) 
		{
            System.out.println(element);
        }
		//System.out.println(Arrays.toString(a));
    
	//	System.out.println(Arrays.toString(a));
		
	   for(int i=0;i<=a.length;i++)
	   {
	   for(int j=0;j<=a.length;j++)
	    {
	   int add=a[i]+a[j];
	    if(add==10)
	    {
	   System.out.println("true==="+add);
	    }
	 else
	    
	   {
		   System.out.println("false===="+add);

	   }
	    
	    }
	   
	  }
}
}
	
	

