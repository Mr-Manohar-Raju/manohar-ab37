package Batch37Assignments;

interface Method1
{
	void add();
}

interface Method2
{
	void sub();
}

interface Method3
{
	void mul();
}

interface Method4
{
	void div();
}

class Method5 implements Method4, Method3, Method2, Method1
{
	static void display()
	{
		System.out.println("Logic of Display");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Logic of Div");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Logic of Add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Logic of Sub");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Logic of Mul");
	}
}
public class Amt49_4InterfaceWithOneClass extends Method5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		Amt49_4InterfaceWithOneClass obj = new Amt49_4InterfaceWithOneClass();
		obj.add();
		obj.div();
		obj.mul();
		obj.sub();

	}

}
