package arrays;

public class SecondLargestElementinArray {

	public static void main(String[] args) {

		int arr[]= {3,54,65,87,98,890};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		System.out.println("second largest element : "+arr[1]);
		
	}

}
