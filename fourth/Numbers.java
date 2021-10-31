package fourth;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of integer: ");
		int num = sc.nextInt();
		int[] arr = new int[20];
		System.out.println("the element of array ");
		for(int i =0; i< num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i =0;i<num;i++) {
			System.out.println(arr[i]);
			if(arr[i]==0) {
				System.out.println("zero");
			}
			else if (arr[i]%2==0) {
				System.out.println("even");
				
				
			}
			else if (arr[i]%2 != 0) {
				System.out.println("odd");
				
			}
		}
		
		
		
	}

}
