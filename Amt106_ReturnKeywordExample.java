package Batch37Assignments;

import returntypeDemo.ReturnKeywordExample1;

public class Amt106_ReturnKeywordExample {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignment 106 - WAP for return keyword for int and double");
		Amt106_ReturnKeywordExample re1 = new Amt106_ReturnKeywordExample();
		//re1.add(10,20);
		//re1.sub(10, 109.34);
		System.out.println(re1.add(10,20));
		System.out.println(re1.sub(10, 109.34));

	}

}
