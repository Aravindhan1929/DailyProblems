package Day1;

import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter You Value :");
		String value = scanner.next();
		String romanValue = value.toUpperCase();

		int intVlaue = 0;


		for (int i = 0; i < romanValue.length(); i++) {
			char charAt = romanValue.charAt(i);

			switch (charAt) {
			case 'M':
				intVlaue = intVlaue+1000;
				break;
			case 'D':
				intVlaue = intVlaue+500;
				break;
			case 'C':
				intVlaue = intVlaue+100;
				break;
			case 'L':
				intVlaue = intVlaue+50;
				break;
			case'X' :
				intVlaue = intVlaue+10;
				break;
			case 'V':
				intVlaue = intVlaue+5;
				break;
			case 'I':
				intVlaue = intVlaue+1;
				break;
			default:
				break;
			}
		}
		System.out.println(intVlaue);
		scanner.close();

	}

}
