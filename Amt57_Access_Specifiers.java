package Batch37Assignments;

public class Amt57_Access_Specifiers {

	public void addition() {
		System.out.println("Addition");
	}
	
	private void subtraction() {
		System.out.println("Subtraction");
	}
	
	protected void multiplication()
	{
		System.out.println("Multiplication");
	}
	
	void divison()
	{
		System.out.println("Divison");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am gonna call all the access speiciers ");
		Amt57_Access_Specifiers obj = new Amt57_Access_Specifiers();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.divison();	
		

	}

}
