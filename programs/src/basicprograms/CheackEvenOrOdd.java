package basicprograms;

import java.util.Scanner;

public class CheackEvenOrOdd {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if(x%2==0) {
			System.out.println(x+"- is even number");
		}else {
			System.out.println(x+"- is odd number");

		}
	}

}
