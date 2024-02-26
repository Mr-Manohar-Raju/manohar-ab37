package Batch37Assignments;

public class Amt70_PrintUrNameinRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String name="My Name is Manish";
		System.out.println(name.length());
		String myname=name.toLowerCase();
		System.out.println(name);
		
		for(int i=16; i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}
		

	}

}
