package arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,48};
		int delete=20;
		for(int i=0;i<arr.length-1;i++) {
			if(delete==arr[i]) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				break;
			}
		}

		
		for(int x=0;x<arr.length-1;x++) {
			System.out.print(arr[x]+" ");
		}
		
	}

}
