package Batch37Assignments;

import java.util.Scanner;

public class Amt42_UseSwitchKeywordWithScannerClassAndPerformASMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		double result;
		Scanner s1=new Scanner(System.in);
		switch(1) {
		case 1:
			System.out.println("Enter a Value");
			a=s1.nextInt();
			System.out.println("Enter b Value");
			b=s1.nextInt();
			result=a+b;
			System.out.println("Addition of A and B:" +result);
			break;
		case 2:
			System.out.println("Enter a Value");
			a=s1.nextInt();
			System.out.println("Enter b Value");
			b=s1.nextInt();
			result=a-b;
			System.out.println("Subtraction of A and B:" +result);
			break;
		case 3:
			System.out.println("Enter a Value");
			a=s1.nextInt();
			System.out.println("Enter b Value");
			b=s1.nextInt();
			result=a*b;
			System.out.println("Multiplication of A and B:" +result);
			break;
		case 4:
			System.out.println("Enter a Value");
			a=s1.nextInt();
			System.out.println("Enter b Value");
			b=s1.nextInt();
			result=a/b;
			System.out.println("Divison of A and B:" +result);
			break;
		default :
			System.out.println("Please enter valid input");
		}

	}

}
