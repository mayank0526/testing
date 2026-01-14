package Pack1;
import java.util.*;


public class lab9 {
	Scanner sc = new Scanner(System.in);
	String name =sc.nextLine();
	StringBuilder sb = new StringBuilder(name);
	
	
	public void add() {
		sb.append(name);
		System.out.println(sb);
	}
	public void show() {
		System.out.println(sb);
	}
	
	public void replace() {
		for(int i =0 ; i<sb.length();i++) {
			if(i%2==1) {
				sb.setCharAt(i, '#');
			}
		}
	}
	
	public void remove() {
		StringBuffer result = new StringBuffer();
		   for(int i=0; i< sb.length(); i++) {
			   char ch = sb.charAt(i);
			   if(result.indexOf(String.valueOf(ch)) == -1) {
				   result.append(ch);
			   }
		   }
		   sb.setLength(0);
		   sb.append(result);
//		   System.out.println(result);
		
	}
	
	public void upper() {
		for(int i =0 ; i< sb.length();i++) {
			if(i%2!=0) {
				sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
			}
			
		}
	}
	
	
	
	
	
	
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab9 obj =new lab9();
//		obj.add();
//		obj.replace();
//		obj.show();
//		obj.remove();
		obj.upper();
		obj.show();
 
	}
 
}
