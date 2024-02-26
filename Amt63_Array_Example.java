package Batch37Assignments;
/*
 * Create an array of length =5 of 
 * int datatype and fetch its value from scanner class.
 */
import java.util.Scanner;

public class Amt63_Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollno[] = new int[5]; // rollno declaration
		for(int i=0; i<4; i++)
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of index"+ i);
		rollno[i] = s1.nextInt();
		}
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
	}

	}


