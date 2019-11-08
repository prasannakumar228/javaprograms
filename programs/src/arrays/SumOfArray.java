package arrays;

public class SumOfArray {

	public static void main(String[] args) {

      int arr[]= {2,4,6,7,8,9};
      int size=arr.length;
      int sum=0;
      
      for(int i=0;i<size;i++) {
    	  sum=sum+arr[i];	  
      }
    	
      System.out.println("sum of total array is  :"+sum);
		
	System.out.println("avarage of arra is :"+sum/size);
		
	}

}
