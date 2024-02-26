package Batch37Assignments;

class SingleLevelInheritence11 // Parent Class
{
	void Selenium() 
	{
		System.out.println("I am Selenium Non Static Method");
	}

	void Java() 
	{
		System.out.println("I am Java Non Static Method");
	}

}

public class Amt44_SingleLevelInheritenceWithMethod extends SingleLevelInheritence11 {
	
	static void Gk() 
	{
		System.out.println("I am Gk Static Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gk();
		Amt44_SingleLevelInheritenceWithMethod obj = new Amt44_SingleLevelInheritenceWithMethod();
		obj.Selenium();
		obj.Java();
		

	}

}
