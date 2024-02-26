package Batch37Assignments;

public class Amt8_ConstructorOverLoading {
	
	Amt8_ConstructorOverLoading(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	Amt8_ConstructorOverLoading(int a)
	{
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		new Amt8_ConstructorOverLoading(10,10);
		new Amt8_ConstructorOverLoading(10);
	}

}
