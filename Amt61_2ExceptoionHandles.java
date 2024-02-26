package Batch37Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

/*WAP to handle below 2 exceptions by using 2 catch blocks Scanner s1= new Scanner
int c = 1/0; int a = s1.nextint()
*/

public class Amt61_2ExceptoionHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a value");
		int a = s1.nextInt();
		System.out.println("a is:" +a); 
		int c = 1/0;
		}
		catch(ArithmeticException a1)
		{
		System.out.println("int cannot store infinity, so please do not worry i have handled it");
		}
		catch(InputMismatchException a2)
		{
		System.out.println("please do not worry i handled it");
		}
	}

}
