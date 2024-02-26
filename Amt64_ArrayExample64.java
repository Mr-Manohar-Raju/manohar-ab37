package Batch37Assignments;

/*
 * "Create an array of length 3 having String datatype and print it without sorting. Now Sort the array and print its value after sorting.
Use toString function to print the array"
 */

import java.util.Arrays;

public class Amt64_ArrayExample64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = new String[3];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Mano";		
		System.out.println("Before sorting");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);		
		System.out.println("After sorting");
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
	}

}
