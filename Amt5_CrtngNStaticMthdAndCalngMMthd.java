package Batch37Assignments;

public class Amt5_CrtngNStaticMthdAndCalngMMthd { // creating Non static Method & calling Inside Method

	void NonStaticMethod()
	{
		System.out.println("I am Non Static Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am Main Method");
		Amt5_CrtngNStaticMthdAndCalngMMthd obj = new Amt5_CrtngNStaticMthdAndCalngMMthd(); //object creation
		obj.NonStaticMethod(); //calling non static method using object
		

	}

}
