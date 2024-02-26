package Batch37Assignments;

interface Assignment4
{
	void method4();
}
interface Assignment3
{
	void method3();
}
interface Assignment2
{
	void method2();
}
interface Assignment1
{
	void method1();
}
public class Amt53_Interface_Assignment implements Assignment1, Assignment2, Assignment3, Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amt53_Interface_Assignment obj = new Amt53_Interface_Assignment();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Called Interface Assignment4");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Called Interface Assignment3");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Called Interface Assignment2");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Called Interface Assignment1");
	}

}
