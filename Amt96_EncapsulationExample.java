package Batch37Assignments;

class AuthenticationApi
{
private int Age=18;
private double Dval=154.52;
private float Fvalue=12234;
private char Cval='m';
private boolean Bval=true;
public int get_Age()
{
	return Age;
}
public void set_Age(int Age)
{
	this.Age=Age;
}
public double get_Dval()
{
	return Dval;
}
public void Set_Dval(double Dval)
{
	this.Dval=Dval;
}
public float get_Fvalue()
{
	return Fvalue;
}
public void set_Fvalue(float Fvalue)
{
	this.Fvalue=Fvalue;
}
public char get_Cval()
{
	return Cval;
}
public void set_Cval(char Cval)
{
	this.Cval=Cval;
}
public boolean get_Bval()
{
	return Bval;
}
public void set_Bval(boolean Bval)
{
	this.Bval=Bval;
}
}
public class Amt96_EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthenticationApi objp1 = new AuthenticationApi();
		objp1.set_Age(50);			
		objp1.Set_Dval(213.3);
		objp1.set_Fvalue(455);
		objp1.set_Cval('Y');
		objp1.set_Bval(false);
		System.out.println(objp1.get_Age());
		System.out.println(objp1.get_Dval());
		System.out.println(objp1.get_Fvalue());
		System.out.println(objp1.get_Cval());
		System.out.println(objp1.get_Bval());

	}

}
