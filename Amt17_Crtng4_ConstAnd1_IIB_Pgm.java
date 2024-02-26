package Batch37Assignments;

public class Amt17_Crtng4_ConstAnd1_IIB_Pgm {
	
	Amt17_Crtng4_ConstAnd1_IIB_Pgm()
	{
		System.out.println("Constructor 1");
	}
	Amt17_Crtng4_ConstAnd1_IIB_Pgm(int a)
	{
		System.out.println(a);
	}
	Amt17_Crtng4_ConstAnd1_IIB_Pgm(double a)
	{
		System.out.println(a);
	}
	Amt17_Crtng4_ConstAnd1_IIB_Pgm(String name)
	{
		System.out.println(name);
	}
	
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		new Amt17_Crtng4_ConstAnd1_IIB_Pgm();
		new Amt17_Crtng4_ConstAnd1_IIB_Pgm(100);
		new Amt17_Crtng4_ConstAnd1_IIB_Pgm(1000.50);
		new Amt17_Crtng4_ConstAnd1_IIB_Pgm("Manohar");
	}

}
