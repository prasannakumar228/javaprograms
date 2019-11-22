package arrays;


/*Algoritham:
 *1. find out the transporse of given matrix
 *2.after reverse the row values
 *note:-
 *this procedure for 90 degrees rotarion 
 *if want to rotate the 180 and 270 degree rotation repate the above procedure 2 and 3 time you get output
 *Example:this is for 180 degree rotation(replace this code to given below)
 *for(int i=0;i<2;i++){
 *int[][] matrixTranspose = work.matrixTranspose(arr);
	     int[][] reverseColumn = work.reverseColumn(matrixTranspose);
	     work.printMatrix(reverseColumn);
 *
 *}System.out.prinln("---------------");
 * ----------------------------------------
 * 
 * 
*/






public class RotateMatrixClockWise90Degrees {
		
		public void printMatrix(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
		public int[][] matrixTranspose(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=i;j<arr.length;j++) {
	                int temp=arr[i][j];
	                arr[i][j]=arr[j][i];
	                arr[j][i]=temp;
				}
			}

		return arr;
		}
		
		public int[][] reverseColumn(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				int j=0;
				int k=arr.length-1;
				while(j<k) {
					int temp=arr[i][j];
					arr[i][j]=arr[i][k];
					arr[i][k]=temp;
					j++;
					k--;
				}
			}
			return arr;         
		}
		
		
		
		public static void main(String[] args) {

RotateMatrixClockWise90Degrees work = new RotateMatrixClockWise90Degrees();	
//replace here
            int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			int[][] matrixTranspose = work.matrixTranspose(arr);
			int[][] reverseColumn = work.reverseColumn(matrixTranspose);
			work.printMatrix(matrixTranspose);
			
			
		}



	
	
	
}
