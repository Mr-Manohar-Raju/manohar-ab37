package Batch37Assignments;

//create a class and create two concrete methods inside a class(static add, non static sub), 
//create abstract class and create two abstract methods (multiplication, divison), 
//create two concrete methods inside main method 
class PaMethod{
	static void add()
	{
		System.out.println("Logic of Add");
	}
	
	void sub()
	{
		System.out.println("Logic of Sub");		
	}
	}

abstract class abcollege extends PaMethod
{
	abstract void mul();
	abstract void divison();	
}

public class Amt48_Interface_Example extends abcollege  {
	
	void add1()
	{
		System.out.println("Logic of Add1");
		
	}
	
	void add2()
	{
		System.out.println("Logic of add2");
		
	}	

	@Override
	void mul() {
		System.out.println("Logic of Mul");
		
	}

	@Override
	void divison() {
		System.out.println("Logic of divison");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		Amt48_Interface_Example obj = new Amt48_Interface_Example();
		obj.add1();
		obj.add2();
		obj.sub();
		obj.mul();
		obj.divison();

	}

}
