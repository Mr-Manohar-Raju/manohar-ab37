package Batch37Assignments;

class Amt45_MultiLevelInheritanceWithNonStaticMethod2
{
	void Sub()
	{
		System.out.println("Subtraction");
	}
}

class Amt45_MultiLevelInheritanceWithNonStaticMethod1 extends Amt45_MultiLevelInheritanceWithNonStaticMethod2
{
	void Mul()
	{
		System.out.println("Multiplication");	
	}
}

public class Amt45_MultiLevelInheritanceWithNonStaticMethod extends Amt45_MultiLevelInheritanceWithNonStaticMethod1 {
	
	void Add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amt45_MultiLevelInheritanceWithNonStaticMethod obj = new Amt45_MultiLevelInheritanceWithNonStaticMethod();
		obj.Add();
		obj.Sub();
		obj.Mul();

	}

}
