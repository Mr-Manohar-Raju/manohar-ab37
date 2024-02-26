package Batch37Assignments;

import java.util.Scanner;

/*
 "WAP by using throw keyword
if the age of a person is > 18 then allow him to access www.google.com else throw an ArithmeticException"
 */
public class Amt62_ThrowandThrowsExample {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s1.nextInt();
		System.out.println("Your age is:" +age);
		
		if(age>18)
		{
			System.out.println("Visit google.com");
		}
		else
		{
		throw new ArithmeticException("you are a kid");
		}

	}

}
