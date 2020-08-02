package CorejavaSample;
public class primeno {

	public static void main(String[] args) 
	{
		
		 int a=17;
		 
		 int dm = 0;
		
		 
		 for(int i=2;i<=a-1;i++)
		 {
			 
			 if(a%i==0)
			 {
				 dm=1;
				 
				 
			 }
		 }
		 
		 if(dm==1)
		 {
			 System.out.println("not prime");
			 
		 }
		 else
			 System.out.println(" prime");
		 
		


	}

}
