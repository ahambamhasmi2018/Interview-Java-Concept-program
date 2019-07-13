package Java8;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimePackage {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today Date : "+today);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today date and Tiem now : "+dateTime); 
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		LocalTime time = LocalTime.now();;
		System.out.println("Time Now : "+time); 
	}
}
