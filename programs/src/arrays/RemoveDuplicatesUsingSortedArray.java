package arrays;

public class RemoveDuplicatesUsingSortedArray {

	public static void main(String[] args) {


		int arr[]= {1,2,2,3,3,3,4,4,5};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		
		for(int x:temp) {
			System.out.print(x+" ");
		}
		
	}

}
