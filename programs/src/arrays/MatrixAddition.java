package arrays;

public class MatrixAddition {

	public static void main(String[] args) {


		int arr[][]= {{1,2},{3,4}};
		int arr1[][]= {{1,2},{3,4}};

		int sum[][]=new int[2][2];
		
		
		//adding two arrays 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		}


		//displaying adding array
		for(int k=0;k<sum.length;k++) {
			for(int l=0;l<sum.length;l++) {
				System.out.print(sum[k][l]+" ");
			}
			System.out.println();
		}
		
	}

}
