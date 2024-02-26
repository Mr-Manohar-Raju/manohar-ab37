package Batch37Assignments;

public class Amt6_CrtngMnyNStaticMthdAndCalngMMthd { // creating Multiple Non Static Method and Calling Inside Main Method
	
	void NonStaticMethod1()
	{
		System.out.println("NonStaticMethod1");
	}
	
	void NonStaticMethod2()
	{
		System.out.println("NonStaticMethod2");
	}
	
	void NonStaticMethod3()
	{
		System.out.println("NonStaticMethod3");
	}
	
	void NonStaticMethod4()
	{
		System.out.println("NonStaticMethod4");
	}
	
	void NonStaticMethod5()
	{
		System.out.println("NonStaticMethod5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		//Object Creation
		Amt6_CrtngMnyNStaticMthdAndCalngMMthd obj = new Amt6_CrtngMnyNStaticMthdAndCalngMMthd();
		//Non Static Method Calling using object
		obj.NonStaticMethod1();
		obj.NonStaticMethod2();
		obj.NonStaticMethod3();
		obj.NonStaticMethod4();
		obj.NonStaticMethod5();

	}

}
