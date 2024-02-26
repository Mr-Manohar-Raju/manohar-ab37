package Batch37Assignments;

interface Interface_Class{
	void if_method();
}
abstract class Ab_Class implements Interface_Class{
	abstract void ab_method();
	void cc_method()
	{
		System.out.println("Concrete Method");
	}
}
public class Amt51_Interface_Test extends Ab_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		Amt51_Interface_Test ref = new Amt51_Interface_Test();
		ref.ab_method();
		ref.cc_method();
		ref.if_method();

	}

	@Override
	public void if_method() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method");
	}

	@Override
	void ab_method() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");
	}

}
