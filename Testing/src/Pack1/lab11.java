package Pack1;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter day");
		int day = sc.nextInt();
		
		LocalDate gd = LocalDate.of(year, month, day);
		LocalDate cd = LocalDate.now();
		
		Period period =  Period.between(gd,cd);
		System.out.println("Its been " + period);
		

	}

}
