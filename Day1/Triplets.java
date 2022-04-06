package Day1;
import java.util.ArrayList;
import java.util.Scanner;
public class Triplets {
	static ArrayList<ArrayList<Integer>> temp=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		combination(arr,size);

	}
	public static void combination(int[] arr,int size) {
		int count=0;
		for(int i=0;i<size-2;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k=i+2;k<size;k++) {
					count=arr[i]+arr[j]+arr[k];
					if(count==0) {
						if(isExist(arr[i],arr[j],arr[k])) {
							ArrayList<Integer> temp2=new ArrayList<Integer>();
							temp2.add(arr[i]);
							temp2.add(arr[j]);
							temp2.add(arr[k]);
							temp.add(temp2);
							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						}
					}
				}
			}
		}

	}
	public static boolean isExist(int i,int j,int k) {
		boolean result =true;
		for(int l=0;l<temp.size();l++) {
			 if(temp.get(l).get(0)==i || temp.get(l).get(1)==i || temp.get(l).get(2)==i) {
				 if(temp.get(l).get(0)==j || temp.get(l).get(1)==j || temp.get(l).get(2)==j) {
					 if(temp.get(l).get(0)==k || temp.get(l).get(1)==k || temp.get(l).get(2)==k) {
						 result=false;
					 }
				 }
			 }
		}
		return result;
	}

}
