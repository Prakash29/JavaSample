package CorejavaSample;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateAndTime {

	public static void main(String[] args) 
	{

		LocalDate dt= LocalDate.now();//Date 
		
		System.out.println(dt.toString());
		
		System.out.println(dt.getDayOfMonth());
		
		System.out.println(dt.getDayOfYear());
		 
		
		System.out.println(dt.getMonthValue());
		System.out.println(dt.isLeapYear());
		System.out.println(dt.getDayOfWeek());
		
		System.out.println(dt.plusDays(6).toString());
		
		
		LocalDateTime dtm= LocalDateTime.now();//Date and Time
		
		System.out.println(dtm.toString());
		
		LocalTime tm=LocalTime.now();//Time
		
		System.out.println(tm.toString());
		
		Instant ist=Instant.now();
		System.out.println(ist.toString());
		


	}

}
