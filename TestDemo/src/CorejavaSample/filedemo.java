package CorejavaSample;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filedemo {

	public static void main(String[] args) throws IOException
	{

     Path path= Paths.get("C:\\Users\\DELL 6430\\Downloads\\demo\\demoaaaa.txt");
    
     
  try(  BufferedWriter wt =Files.newBufferedWriter(path))
    {
	  wt.write("Hello World dayyyyyy");


		
    }
	
	System.out.println("file write succesfully");
	}
	

}
