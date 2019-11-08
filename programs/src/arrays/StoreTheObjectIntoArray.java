package arrays;

public class StoreTheObjectIntoArray {

	public static void main(String[] args) {


		Emp arr[]=new Emp[3];
		arr[0]=new Emp(1,"prasanna");
		arr[1]=new Emp(2,"prasannawrferf");
		arr[2]=new Emp(3,"prasannakumar");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
