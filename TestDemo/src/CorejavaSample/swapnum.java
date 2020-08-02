package CorejavaSample;
public class swapnum {

	public static void main(String[] args)
	{
            int a= 10;
            int b= 20;
            
           int temp;
           
          // without using 3rd verible;
           
          /* a=a+b;
           b=a-b;
           a=a-b;*/
           //System.out.println(a);
            //using temp
      
           /*temp=a;
           a=b;
           b=temp;
           System.out.println(a);
           
       */
           //usinng XOR
           a=a^b;
           b=a^b;
           a=a^b;

           System.out.println(a);
	}

}
