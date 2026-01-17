package Pack1;
import java.util.*;


public class lab3_1 {
	
	 

	
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("First name");
		  String firstname = sc.nextLine();
		System.out.println("last name");
		String lastname = sc.nextLine();

        if (firstname.trim().isEmpty() || lastname.trim().isEmpty()) {
                throw new Exception("name blank");
            }

        else {
       
        }

		}
		catch(Exception e) {


			System.out.println(e.getMessage());
				
			
		}


	}

}
