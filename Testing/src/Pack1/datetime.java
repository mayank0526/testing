package Pack1;
import java.time.*;


public class datetime {
public static void main (String[]args) {
	Instant currenttime = Instant.now();
	System.out.println("Current time is " + currenttime);
	
	LocalDate now =  LocalDate.now();
	LocalDate Independece= LocalDate.of(1947, Month.AUGUST, 15);
	Period period = Independece.until(now);
	System.out.println("Its been " + period + " since independence");
	
	System.out.println("freedom day is " + Independece);
	System.out.println("Now is " + now);
	System.out.println("tomorrow " + now.plusDays(1));
	System.out.println("Lastmoth " + now.minusMonths(1));
	System.out.println("LeapYear- " + now.isLeapYear());
	System.out.println("Move to 30th day of month " + now.withDayOfMonth(30));
	
	
	
	ZonedDateTime ct = ZonedDateTime.now();
	ZonedDateTime ctinparis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	System.out.println("India time:" + ct);
	System.out.println("Paris time:" +ctinparis);
			
}

}
