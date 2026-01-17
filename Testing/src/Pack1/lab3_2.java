package Pack1;

import java.util.*;
public class lab3_2 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>15)
		throw new Exception("valid");
		System.out.println("Invalid");
		}
		
		
		catch (Exception e){
			 System.out.println(e.getMessage());
		}

	}

}
