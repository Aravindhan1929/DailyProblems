package Day2;
import java.util.Scanner;
public class WordDifference {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		WordDiff(s1,s2);
		System.out.println();
		WordDiff(s2,s1);
	}
	static void WordDiff(String str1,String str2) {
		char[] temp=str2.toCharArray();
		for(int i=0;i<str1.length();i++) {
			char a=str1.charAt(i);
			int count=0;
			for(int j=0;j<temp.length;j++) {
				if(temp[j]!=a) {
					count++;
				}
			}
			if(count==temp.length) {
				System.out.print(a);
			}
		}
	}

}
