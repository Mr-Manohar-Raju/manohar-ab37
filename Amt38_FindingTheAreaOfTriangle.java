package Batch37Assignments;

import java.util.Scanner;

//WAP to find area of triangle by taking values of b and h from scanner class
public class Amt38_FindingTheAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("finding area of triangle");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Base value");
		int b=s1.nextInt();
		System.out.println("Enter Height value");
		int h=s1.nextInt();
		double area=1/2*b*h;
		System.out.println(area);

	}

}
