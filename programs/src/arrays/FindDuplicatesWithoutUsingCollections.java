package arrays;

public class FindDuplicatesWithoutUsingCollections {

	public static void main(String[] args) {

		int arr[]= {98,4,4,6,8,8};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println("duplicate elements :"+arr[i]);
				}
			}
		}

		
		
	}

}
