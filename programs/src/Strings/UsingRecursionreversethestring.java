package Strings;

public class UsingRecursionreversethestring {
	public static void reverse(String arr) {

		for(int i=0;i<arr.length();i++) {
			System.out.print(arr.charAt(i));
		}
		System.out.print(" ");
		
	}
	public static void main(String[] args) {


		String arr[]= {"i","love","india"};
		for(int i=arr.length-1;i>=0;i--) {
         reverse(arr[i]);
      }
	}



}
