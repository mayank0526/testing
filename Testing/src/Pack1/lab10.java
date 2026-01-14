package Pack1;

public class lab10 {
	public static boolean StringIsPositive(String str) {
		
		  if(str.length() == 0) return true;
		   
		  
		 for(int i=0;i<str.length()-1;i++) {
			 if(str.charAt(i) > str.charAt(i+1)) return false;
		 }
		 return true;
	  }
	  public static void main(String args[]) {
		  String str = "aBc";
		  
		  System.out.println(StringIsPositive(str));

}
}

