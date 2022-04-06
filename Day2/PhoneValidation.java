package Day2;
import java.util.Scanner;
import java.util.regex.*;
public class PhoneValidation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		if(isValidNumber(str)) {
			System.out.println("Valid Number");
		}else {
			System.out.println("Not Valid Number");
		}

	}
	static boolean isValidNumber(String str) {
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
		Matcher match = ptrn.matcher(str);    
		return (match.find() && match.group().equals(str));
	}

}
