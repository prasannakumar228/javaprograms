package arrays;

public class FindSmallestNumberInGivenArray {

	public static void main(String[] args) {


		int arr[]= {2,45,576,76,8,798,98,54};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(min);
	}

}
