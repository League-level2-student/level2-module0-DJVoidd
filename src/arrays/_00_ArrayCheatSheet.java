package arrays;

import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] string = new String[5];
		//2. print the third element in the array
		System.out.println(string[3]);
		//3. set the third element to a different value
		string[3] = "guh";
		//4. print the third element again
		System.out.println(string[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < string.length; i++) {

			System.out.println(string[i]);

		}

		//6. make an array of 50 integers
		int[] intgr = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		int smallest = Integer.MAX_VALUE;
		int biggest = 0;
		Random ran = new Random();
		int rannum;
		for (int i = 0; i < intgr.length; i++) {
			rannum = ran.nextInt(50);
			intgr[i] = rannum;
			if (intgr[i] < smallest) {
				smallest = intgr[i];
			}
			else if (intgr[i] > biggest) {
				biggest = intgr[i];
			}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int x : intgr) {
			System.out.print(x + " ");
		}
		//10. print the largest number in the array.
		System.out.println("\n" + biggest);
	}
}
