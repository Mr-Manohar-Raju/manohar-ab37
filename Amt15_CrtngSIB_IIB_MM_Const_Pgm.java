package Batch37Assignments;

public class Amt15_CrtngSIB_IIB_MM_Const_Pgm {
	
	static 
	{
		System.out.println("I am Static Block");
	}
	
	{
		System.out.println("I am IIB Block");
	}
	
	Amt15_CrtngSIB_IIB_MM_Const_Pgm()
	{
		System.out.println("I am Constructor");
	}
	
	Amt15_CrtngSIB_IIB_MM_Const_Pgm(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		new Amt15_CrtngSIB_IIB_MM_Const_Pgm();
		
	}

}
