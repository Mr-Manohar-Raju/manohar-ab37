package Batch37Assignments;
//49.Create a class and in this create interface as Amazon with login and 
//logout methods also create child class and create relation between them 
interface Amazon
{
	void login();
	void logout();
}

public class Amt49_Interface_Class implements Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Amt49_Interface_Class obj = new Amt49_Interface_Class();
		obj.login();
		obj.logout();

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Logic of login");
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logic of logout");
		
	}

}
