package Day2;
import java.util.*;
import java.util.regex.*;
public class EmailValidation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String email=input.nextLine();
		 String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		 Pattern pattern = Pattern.compile(regex); 
		 Matcher matcher = pattern.matcher(email); 
		 if(matcher.matches()) {
			 System.out.println("Valid Email");
		 }else {
			 System.out.println("Not Valid Email");
		 }
	}

}
