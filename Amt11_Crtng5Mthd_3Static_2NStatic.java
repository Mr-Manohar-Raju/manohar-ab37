package Batch37Assignments;

public class Amt11_Crtng5Mthd_3Static_2NStatic {
	
	static void StaticMethod1(int a)
	{
		System.out.println(a);
	}
	
	static void StaticMethod2(double a)
	{
		System.out.println(a);
	}
	
	static void StaticMethod3(char a)
	{
		System.out.println(a);
	}
	
	void NonStaticMethod1(boolean a)
	{
		System.out.println(a);
	}
	
	void NonStaticMethod2(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		StaticMethod1(100);
		StaticMethod2(105.60);
		StaticMethod3('M');
		Amt11_Crtng5Mthd_3Static_2NStatic obj = new Amt11_Crtng5Mthd_3Static_2NStatic();
		obj.NonStaticMethod1(false);
		obj.NonStaticMethod2("Manohar");
		
	}

}
