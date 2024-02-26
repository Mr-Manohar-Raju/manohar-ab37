package Batch37Assignments;

import java.util.Scanner;
//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables

public class Amt37_Add_Sub_Mul_Div_UsingGlblVarScannerClass {
		
	static int a;
	static int b;	
	static int result;
	static Scanner s1=new Scanner(System.in);
	
	
	static void Addition()
	{	
		
		System.out.println("Enter a and b value for addition");
		a=s1.nextInt();
		b=s1.nextInt();
		result=a+b;
		System.out.println("Addition of a and b is: " +result);		
	}
	static void Subtraction()
	{
		System.out.println("Enter a and b value for subtraction");
		a=s1.nextInt();
		b=s1.nextInt();
		result=a-b;
		System.out.println("Subtractopn of a and b is: " +result);		
	}
	static void Multiplication()
	{
		System.out.println("Enter a and b value for multiplication");
		a=s1.nextInt();
		b=s1.nextInt();
		result=a*b;
		System.out.println("Multiplication of a and b is: " +result);		
		
	}
	static void divison()
	{
		System.out.println("Enter a and b value for divison");
		a=s1.nextInt();
		b=s1.nextInt();
		result=a/b;
		System.out.println("Divison of a and b is: " +result);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Addition();
		Subtraction();
		Multiplication();
		divison();
	}

}
