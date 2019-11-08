package Strings;

public class StringRevers {

	
	public void reverse(String str) {
		    String str1="";

				  for(int i=str.length()-1;i>=0;i--) { 
					  str1=str1+str.charAt(i);
					  }
				  
				  System.out.println(str1); 
	}
	
	public void palindrome(String str) {
		String temp=str;
		 String str1="";
		  for(int i=str.length()-1;i>=0;i--) { 
			  str1=str1+str.charAt(i);
			  }
		  
		if(temp.equals(str1)) {
			System.out.println("the given string is palindrome");
		}else {
			System.out.println("the given string is not palindrome");

		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
  
		 StringRevers stringRevers = new StringRevers();
		 stringRevers.reverse("prasanna");
		 stringRevers.palindrome("peep");
	}
}
