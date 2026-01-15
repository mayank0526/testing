package Pack1;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class lab14 {

	
		
		public static void printTime(String zoneId) {
	        ZonedDateTime zd= ZonedDateTime.now(ZoneId.of(zoneId));
	        
	        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	 
	        System.out.println("Current Date & Time in " + zoneId + ": " + zd.format(df));
	    }
	 
	    public static void main(String[] args) {
	        printTime("America/New_York");
	        printTime("Europe/London");
	        printTime("Asia/Tokyo");
	        printTime("Australia/Sydney");

	}

}
