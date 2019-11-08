package arrays;

import java.util.HashSet;

public class RemoveDuplicatesUsingUnSortedArray {

	public static void main(String[] args) {


		int arr[]= {1,6,4,9,5,3,3,6,9};
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			hashSet.add(arr[i]);
		}
		for(int x:hashSet) {
			System.out.print(x+" ");
		}
		
		
	}

}
