package arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {


		int arr[][]= {{1,2},{3,4}};
		int arr1[][]= {{1,2},{3,4}};
		
		int mul[][]=new int[2][2];
		int sum=0;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					sum=sum+arr[i][k]*arr1[k][j];
				}
				mul[i][j]=sum;
		        sum=0;
			}
		}
		
		for(int x[]:mul) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}

}
