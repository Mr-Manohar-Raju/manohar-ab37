package Batch37Assignments;
//WAP with 3 methods main,static add and static subtract. 
//Declare a and b as global variables and initialize then in each method and 
//perform addition and subtraction	
public class Amt20_CrtngMM_StaticAdd_StaticSubPgmForGlblVarble {
	
		static int a;
		static int b;
		
		
	static void Addition()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	static void Subtraction()
	{
		a=10;
		b=200;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Addition();
		Subtraction();
	}

}
