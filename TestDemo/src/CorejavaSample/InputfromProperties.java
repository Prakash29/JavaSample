package CorejavaSample;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class InputfromProperties {

	public static void main(String[] args) throws IOException
	{

		FileReader rd=new FileReader("input.properties");
		Properties p=new Properties();
		p.load(rd);

		
		System.out.println(p.getProperty("URl"));
		System.out.println(p.get("User"));
		System.out.println(p.getProperty("Pass"));
	
	}

}
