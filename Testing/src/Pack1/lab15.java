package Pack1;
import java.time.*;
public class lab15 {

		// TODO Auto-generated method stub
		private String firstName;
	    private String lastName;
	    private LocalDate dateOfBirth;
	 
	    public lab15(String firstName, String lastName, LocalDate dateOfBirth) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	    }
	 
	    // (a) Method to calculate age
	    public int calculateAge() {
	        return Period.between(dateOfBirth, LocalDate.now()).getYears();
	    }
	 
	    // (b) Method to return full name
	    public String getFullName() {
	        return firstName + " " + lastName;
	    }
	 
	    public void displayDetails() {
	        System.out.println("Full Name: " + getFullName());
	        System.out.println("Age: " + calculateAge());
	    }
	
	 
	
	 
	    public static void main(String[] args) {
	        lab15 p = new lab15("Mayank", "Gupta", LocalDate.of(2004, 5, 26));
	        p.displayDetails();
	}

}
