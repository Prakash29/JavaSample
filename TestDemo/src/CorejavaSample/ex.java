package CorejavaSample;
public class ex
{ 
	
	int a;
	int b;
	
	ex( int a ,int b)
	{ 
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println(c);
		
	}
	public  void p( )
	
	{
		
		int c=a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		
		
     ex s= new ex(12,12);
     
     
     //s.p();
	}

}
