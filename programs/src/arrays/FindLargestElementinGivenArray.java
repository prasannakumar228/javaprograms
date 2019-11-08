package arrays;

public class FindLargestElementinGivenArray {

	public static void main(String[] args) {


		int arr[]= {1,6,3,6,9,45,12,89};
	     int max=arr[0];
	     for(int i=0;i<arr.length;i++) {
	    	 if(max<arr[i]) {
	    		 max=arr[i];
	    	 }
	     }
		
		System.out.println("largest number is :"+max);
	}

}
