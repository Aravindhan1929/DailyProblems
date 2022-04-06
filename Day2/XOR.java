package Day2;
import java.util.Scanner;
public class XOR {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] arr=new int[size];
		int max=0;
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				int temp=arr[i]^arr[j];
				if(temp>max) {
					max=temp;
				}
			}
		}
		System.out.println(max);
		

	}

}
