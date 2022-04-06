package Day1;

import java.util.Scanner;

public class HaffmanDecoder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		String numberValue = scanner.next();

		String result = decoder(numberValue);
		System.out.println(result);
		scanner.close();

	}
	public static String decoder(String numberValue) {

		String q = "";

		int counter = 0;
		for (int i = 0; i < numberValue.length(); i++) {
		
			if (numberValue.charAt(i)=='0') {
				if (counter==0) {
					q += "A";
				}
				if(counter==1) {
					q+="B";
				}
				if(counter==2) {
					q+="C";
				}
				if(counter==3) {
					q+="D";
				}
				
				counter = 0;
			}
			
			if (numberValue.charAt(i)!='0') {
				counter++;
			}
			if(counter==4) {
				q+="E";
				counter = 0;
			}
		}	

		return q;
	}

}
