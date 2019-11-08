package arrays;

import java.util.HashMap;

public class FindTheNumberOfAccurancesInArray$AllElements {

	public static void main(String[] args) {

		int arr[]= {1,1,1,2,3,2,4,6,3,5};
		
	  HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
	  
	  for(int i=0;i<arr.length;i++) {
		  if(hashMap.containsKey(arr[i])) {
			  hashMap.put(arr[i], hashMap.get(arr[i])+1);

		  }else {
			  hashMap.put(arr[i], 1); 
		  }
	  }


	  System.out.println(hashMap);
	  
	  

		
	}

}
