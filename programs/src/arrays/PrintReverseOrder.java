package arrays;

import java.util.Scanner;

public class PrintReverseOrder {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int x = scanner.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++) {
        	System.out.println("enter element");
        	int y=scanner.nextInt();
        	arr[i]=y;
        }
        


        for(int j=x-1;j>=0;j--) {
        	System.out.print(arr[j]+" ");
        }
		
	}

}
