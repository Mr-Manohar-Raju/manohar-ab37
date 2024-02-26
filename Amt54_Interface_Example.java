package Batch37Assignments;

interface MyInterface1{
	void MyInterface1Method();
}

interface MyInterface2{
	void MyInterface2Method();
}

abstract class Abclass_01 implements MyInterface2, MyInterface1{
	
	abstract void abmethod1();
}

public class Amt54_Interface_Example extends Abclass_01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Amt54_Interface_Example obj1 = new Amt54_Interface_Example();
		obj1.abmethod1();
		obj1.MyInterface2Method();
		obj1.MyInterface1Method();

	}

	@Override
	public void MyInterface2Method() {
		// TODO Auto-generated method stub
		System.out.println("Calling MyInterface2 Method");
		
	}

	@Override
	public void MyInterface1Method() {
		// TODO Auto-generated method stub
		System.out.println("Calling Myinterface1 Method");
	}

	@Override
	void abmethod1() {
		// TODO Auto-generated method stub
		System.out.println("Calling Abstract Method");
	}

}
