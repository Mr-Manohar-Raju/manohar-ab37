package Batch37Assignments;
interface Example2
{
	void login();
	void logout();
}

interface Example1
{
	void signin();
	void signout();
}
public class Amt50_Interface_Example implements Example1, Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		Amt50_Interface_Example obj = new Amt50_Interface_Example();
		obj.login();
		obj.logout();
		obj.signin();
		obj.signout();

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Login");
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout");
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		System.out.println("Signin");
	}

	@Override
	public void signout() {
		// TODO Auto-generated method stub
		System.out.println("Signout");
	}

}
