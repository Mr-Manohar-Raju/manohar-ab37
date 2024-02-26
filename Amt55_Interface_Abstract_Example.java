package Batch37Assignments;

interface MyInterfaceCalss1{
	void interfacemethod1();
}

interface MyInterfaceClass2 extends MyInterfaceCalss1 {
	void interfacemethod2();
}

abstract class ABclass_02 implements MyInterfaceClass2{
	abstract void myabstractmethod();
}

public class Amt55_Interface_Abstract_Example extends ABclass_02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Amt55_Interface_Abstract_Example objref = new Amt55_Interface_Abstract_Example();
		objref.interfacemethod1();
		objref.interfacemethod2();
		objref.myabstractmethod();
	}

	@Override
	public void interfacemethod2() {
		// TODO Auto-generated method stub
		System.out.println("Calling MyInterface Class2");
	}

	@Override
	void myabstractmethod() {
		// TODO Auto-generated method stub
		System.out.println("Calling Abstract Method");
		
	}

	@Override
	public void interfacemethod1() {
		// TODO Auto-generated method stub
		System.out.println("Calling Interface Class1");
	}

}
