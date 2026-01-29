package Pack1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */
public class expressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input = "1234567890";
//		String regex="\\d+";
//		
//		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(input);
//		
//		
//		boolean result =m.matches();
//		
//		if (result==true) {
//			System.out.println("Matches");
//		}
//		else {
//			System.out.println("Ivalid");
//		}
		
//		String input1 =".*";
//		Pattern p1 = Pattern.compile("shop,mhop,khop,dhop");
//		Matcher match = p1.matcher(input1);
//		System.out.println(match.matches());
//		while(match.find()) {
//			System.out.println(match.group()+ ":" + match.start() + ":" + match.end());
//		}
		
		String input ="123456789555555555";
		String regex="\\d+";

Pattern p=Pattern.compile(regex);
Matcher m=p.matcher(input);
boolean result=m.matches();
if(result==true)
{
	System.out.println("Valid number");
}
		
else
{
	System.out.println("Invalid Number");
}


String input1="today is monday and tomorrow is tuesday and";
Pattern pattern=Pattern.compile("and");
Matcher match=pattern.matcher(input1);
System.out.println(match.matches());

while(match.find())
		{
	System.out.println(match.group()+":"+match.start()+":"+match.end());
		}

String phonemnumer ="861239439";
String regex1="\\d{10}";

Pattern p1=Pattern.compile(regex1);
Matcher m1=p1.matcher(phonemnumer);
boolean result1=m1.matches();
if(result1==true)
{
System.out.println("Valid phone number");
}

else
{
System.out.println("Invalid phone Number");
}
//////////////////////////////////////////////////////////////////////
String input2 ="Exo1";
String regex2="^[A-Z][a-z]+\\d$";

Pattern p2=Pattern.compile(regex2);
Matcher m2=p2.matcher(input2);
boolean result2=m2.matches();
if(result2==true)
{
System.out.println("matching");
}
 
else
{
System.out.println("not matching");
}
//////////////////////////////////////////////////////////////////////
String email ="test.user@gmail.com";
String emailregex2="^[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+\\.[A-Za-z]{2,}$";
 
Pattern emailp2=Pattern.compile(emailregex2);
Matcher emailm2=emailp2.matcher(email);
boolean emailresult2=emailm2.matches();
if(emailresult2==true)
{
System.out.println("email matching");
}
 
else
{
System.out.println("email not matching");
}
	}
}




