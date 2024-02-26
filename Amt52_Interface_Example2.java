package Batch37Assignments;

interface sample02
{
	void sample021();
}
interface Sample01
{
	void sample011();
}

public class Amt52_Interface_Example2 implements Sample01, sample02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amt52_Interface_Example2 obj = new Amt52_Interface_Example2();
		obj.sample011();
		obj.sample021();

	}

	@Override
	public void sample021() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		
	}

	@Override
	public void sample011() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	

}
