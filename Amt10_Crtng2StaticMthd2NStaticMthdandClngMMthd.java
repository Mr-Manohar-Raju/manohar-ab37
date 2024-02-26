package Batch37Assignments;
//WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. Multiply and divide in last two and call in main method.
public class Amt10_Crtng2StaticMthd2NStaticMthdandClngMMthd {
	
	static void StaticMethod1()
	{
		int a=30, b=50, Addition=a+b;
		System.out.println(Addition);
		
	}
	static void StaticMethod2()
	{
		int a=30, b=50, Subtraction=a-b;
		System.out.println(Subtraction);
	}
	
	void NonStaticMethod1()
	{
		int a=30, b=50, Multiplication=a*b;
		System.out.println(Multiplication);
	}
	
	void NonStaticMethod2()
	{
		double a=30, b=50, Divison=a/b;
		System.out.println(Divison);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		StaticMethod1();
		StaticMethod2();
		Amt10_Crtng2StaticMthd2NStaticMthdandClngMMthd obj = new Amt10_Crtng2StaticMthd2NStaticMthdandClngMMthd();
		obj.NonStaticMethod1();
		obj.NonStaticMethod2();
		

	}

}
