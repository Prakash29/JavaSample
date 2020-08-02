package CorejavaSample;
public class main {

	public static void main(String[] args)
	
	{try
	{
		
	
		encapsulationDemo obj=new encapsulationDemo();
		
		obj.setUsername("prakash");
		obj.setPassword("prakash");
		
		 System.out.println("user name: " + obj.getUsername());
		 System.out.println("pass: " + obj.getPassword());
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}
