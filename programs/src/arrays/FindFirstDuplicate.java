package arrays;

public class FindFirstDuplicate {

	public static void main(String[] args) {


		int arr[]= {23,1,34,5,6,2,34,5};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("first duplicate  :"+arr[i]);
					count++;
					break;
				}
			}
			if(count>0) {
				break;
			}
		}
		
		
		
	}

}
