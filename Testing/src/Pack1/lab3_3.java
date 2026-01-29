package Pack1;

import java.util.Scanner;



public class lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			System.out.println("Enter salary");
			Scanner sc = new Scanner(System.in);
			int salary = sc.nextInt();
			if (salary<3000)
			throw new Exception("Invalid");
			System.out.println("valid");
			}
			
			
			catch (Exception e){
				 System.out.println(e.getMessage());
			}

	}

}
