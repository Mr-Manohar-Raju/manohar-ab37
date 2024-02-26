package Batch37Assignments;
//WAP with 3 methods main,static add and static subtract. 
//Declare and initialize a and b global variables as non- static in nature and then perform addition and subtraction with static methods
public class Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble {
	
	int a=10;
	int b=20;
	int sum;
		
	static void Add()
	{
		Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble obj=new Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble();
		//obj.a=10;
		//obj.b=20;
		obj.sum=obj.a+obj.b;
		System.out.println("Addition A value:" +obj.sum);
	}
	
	static void Sub()
	{
		Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble obj=new Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble();
		obj.sum=obj.a-obj.b;
		System.out.println("Subtraction A value:" +obj.sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble obj = new Amt21_CrtngMM_NStaticAdd_NStaticSubPgmForGlblVarble();
		Add();
		Sub();
		
		

	}

}
