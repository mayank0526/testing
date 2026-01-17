package Pack1;

import java.util.Arrays;
import java.util.Scanner;

public class lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("First product");
		
String f = sc.nextLine();
System.out.println("Second product");
String s = sc.nextLine();

String arr [] = {f,s};	
Arrays.sort(arr);

System.out.println("Sorted order of  products :");
for (int i =0;i<arr.length;i++) {
	
	
	System.out.println(arr[i]);
	
}
		
		
		
	}

}
