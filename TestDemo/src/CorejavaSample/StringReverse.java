package CorejavaSample;
import java.util.Scanner;

public class StringReverse
{
	public void one()
	{

        String str="Prakash";
        int i;
        String reverse="";
        for(i=str.length()-1;i>=0;i--)
        {
       reverse=reverse+str.charAt(i);
       System.out.println(reverse);
       }
	}

	public void two()
	{
	 String input = "Prakash"; 
	  
    // getBytes() method to convert string  
    // into bytes[]. 
    byte [] strAsByteArray = input.getBytes(); 

    byte [] result =  
               new byte [strAsByteArray.length]; 

    // Store result in reverse order into the 
    // result byte[] 
    for (int i = 0; i<strAsByteArray.length; i++) 
        result[i] =  
         strAsByteArray[strAsByteArray.length-i-1]; 

    System.out.println(new String(result)); 
} 

    public static void main(String[] args)
    {
      StringReverse rv=new StringReverse();
      rv.one();
    	
      rv.two();
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
      
        String str="Prakash";

        
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}


