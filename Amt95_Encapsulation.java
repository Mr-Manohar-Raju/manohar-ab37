package Batch37Assignments;

class Authentication_Api
{
	private String Username="contact@gtam";
	public String get_Username()
	{
		return Username;
	}
	
	public void set_Username(String Username)
	{
	this.Username=Username;	
	}
	private String Password="password";
	public String get_Password()
	{
		return Password;
	}
	
	public void set_Password(String Password)
	{
		this.Password=Password;
	}
}

public class Amt95_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authentication_Api ap1 = new Authentication_Api();
		ap1.set_Username("yaalvizhimanohar@gmail.com");
		System.out.println(ap1.get_Username());
		ap1.set_Password("yaalvizhi");
		System.out.println(ap1.get_Password());

	}

}
