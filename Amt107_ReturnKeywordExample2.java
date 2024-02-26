package Batch37Assignments;

import java.util.Scanner;

public class Amt107_ReturnKeywordExample2 {
	
	int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	double sub(int a, double b)
	{
		double sub = a-b;
		return sub;
	}
	
	String Name(String s) 
	{
		String name="hi";
		return name;
	}
	float number(float f)
	{
	  float Number=15.6748f;
	  return Number;
	}
	
	boolean state(boolean y)
	{
		boolean y1=true;
		return y1;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignment 107");
		System.out.println("WAP for return keyword for float , double , string , boolen , using scanner class");
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s1.nextInt();
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		System.out.println("Enter the value of String");
		String s = s1.next();
		System.out.println("Enter the value of float");
		float f = s1.nextFloat();
		System.out.println("Enter the value of boolean");
		boolean y = s1.nextBoolean();
		
		Amt107_ReturnKeywordExample2 z1 = new Amt107_ReturnKeywordExample2();
		System.out.println("Int Addition value is:" +z1.add(a, b));
		System.out.println("Double Sub value is:" +z1.sub(a, b));
		System.out.println("String Name:" +z1.Name(s));
		System.out.println("Float number is:" +z1.number(f));
		System.out.println("Boolean value of State:" +z1.state(y));
		
		
		
		
		
	}

}

/*
System.out.println("Enter byte value");
byte a = s1.nextByte();
System.out.println("Enter short value");
short b =s1.nextShort();
System.out.println("Enter long value");
long d =s1.nextLong();
System.out.println("Enter double value");
double e =s1.nextDouble();
System.out.println("Enter float value");
float f =s1.nextFloat();
System.out.println("Enter boolean value");
boolean g =s1.nextBoolean();
System.out.println("Enter string value");
String name =s1.next();*/