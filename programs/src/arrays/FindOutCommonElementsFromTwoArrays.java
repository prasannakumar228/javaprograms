package arrays;

public class FindOutCommonElementsFromTwoArrays {

	public static void main(String[] args) {


		int arr[]= {2,6,4,8,9};
		int arr1[]= {67,26,4,5,67};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		
	}

}
