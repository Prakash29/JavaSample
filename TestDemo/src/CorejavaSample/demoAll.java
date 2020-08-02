package CorejavaSample;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class demoAll {

	public static void main(String[] args) 
	{
	

		LocalDate dt=LocalDate.now();
		System.out.println(dt);
		
		LocalDateTime dtm= LocalDateTime.now();
		System.out.println(dtm);
		
		
		
		String str="prakash";
		
		String rev="";
		
		System.out.println(str);
		for(int i=str.length()-1;i>0;i--)
		{
			rev=rev+str.charAt(i);
			
			System.out.println(rev);
		}
		System.out.println(rev);
		
		
		
		StringBuilder sb=new StringBuilder("pms");
		System.out.println(sb.reverse());
		
		StringBuffer sbf=new StringBuffer("Sonawane");
		System.out.println(sbf.reverse());
		
		
	}

}
