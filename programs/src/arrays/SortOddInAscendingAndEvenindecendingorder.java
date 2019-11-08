package arrays;

public class SortOddInAscendingAndEvenindecendingorder {
	
	
	public static int[] ascSort(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}
	public static int[] descSort(int arr[]) {
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
		return arr;
	}

	public static void main(String[] args) {


		int arr[]= {13,2,4,15,12,10,5,8};

		int x=arr.length/2;
		int m=0;
		int n=0;
		int odd[]=new int[x];
		int even[]=new int[x];

		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				even[m]=arr[i];
				m++;
			}else {
				odd[n]=arr[i];
				n++;
			}
		}
		int[] ascSort = ascSort(odd);
		int[] descSort = descSort(even);
		int k=0;
		int l=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=descSort[k];
				k++;
			}else {
				arr[i]=ascSort[l];
				l++;
			}
		}
		for(int c:arr) {
			System.out.print(c+" ");
		}
		
	}

}
