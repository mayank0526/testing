package Pack1;

import java.io.InputStream;
import java .util.Scanner;
public class lab7 {

enum gender {
	M,F
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        String input = sc.next().toUpperCase();

if (input.equals(gender.M.name()) || input.equals(gender.F.name())) {
            System.out.println("Gender accepted: " + input);
        } else {
            System.out.println("Invalid gender!  enter M or F only.");
        }


    }
}



