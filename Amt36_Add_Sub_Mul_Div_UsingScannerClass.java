package Batch37Assignments;

import java.util.Scanner;

//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as local variables
public class Amt36_Add_Sub_Mul_Div_UsingScannerClass {
	
	static void Addition() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = s1.nextInt();
		System.out.println("Enter the b value");
		int b = s1.nextInt();
		int add = a + b;
		System.out.println("Addition a and b is:" +add);

	}

	static void Subtraction() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the c value");
		int c = s1.nextInt();
		System.out.println("Enter the d value");
		int d = s1.nextInt();
		int sub = c - d;
		System.out.println("Subtraction of c and d is:" +sub);
	}

	static void Multiplication() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the e value");
		int e = s1.nextInt();
		System.out.println("Enter the f value");
		int f = s1.nextInt();
		int mul = e * f;
		System.out.println("Multiplication of e and f is:" +mul);
	}

	static void Divison() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the g value");
		double g = s1.nextDouble();
		System.out.println("Enter the h value");
		double h = s1.nextDouble();
		double div = g / h;
		System.out.println("Divison of g and h is:" +div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Addition();
		Subtraction();
		Multiplication();
		Divison();

	}

}
