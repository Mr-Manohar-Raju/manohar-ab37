package Batch37Assignments;

interface Int_Class3 {
	void int_method3();
}

interface Int_Class2 extends Int_Class3 {
	void int_method2();
}

interface Int_Class1 extends Int_Class2 {
	void int_method1();
}

public class Amt56_Interface_Example implements Int_Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Amt56_Interface_Example objint = new Amt56_Interface_Example();
		objint.int_method1();
		objint.int_method2();
		objint.int_method3();
	}

	@Override
	public void int_method2() {
		// TODO Auto-generated method stub
		System.out.println("Interface method 2");
	}

	@Override
	public void int_method3() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method 3");
	}

	@Override
	public void int_method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method 1");

	}

}
