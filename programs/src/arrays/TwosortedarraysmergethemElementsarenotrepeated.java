package arrays;

public class TwosortedarraysmergethemElementsarenotrepeated {


	
	public static void intersect(int[] arr, int[] arr1, int m, int n) {

		int i=0;
		int j=0;
		
		while(i<m && j<n) {
			if(arr[i]<arr1[j]) {
				System.out.print(arr[i]+" ");
				i++;
			}else if(arr[i]>arr1[j]){

				System.out.print(arr1[j]+" ");
				j++;
			}else {
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
		}
		   while(i < m) {
		       System.out.print(arr[i]+" "); 
		       i++;
		   }
		      while(j < n) {
		       System.out.print(arr1[j]+" "); 
		        j++;
		      }
		
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,9,10,13};
		int arr1[]= {2,3,4,5,6,7,8,9,11,15};
		int m=arr.length;
		int n=arr1.length;
		intersect(arr,arr1,m,n);
				 
	}


}
