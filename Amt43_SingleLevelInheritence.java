package Batch37Assignments;
//WAP for single level inheritance in a single program and make all methods non static(selenium,java,gk) by creating object in child class

class SingleLevelInheritence1 // Parent Class
{
	void Selenium() {
		System.out.println("I am Selenium Non Static Method");
	}

	void Java() {
		System.out.println("I am Java Non Static Method");
	}

}

public class Amt43_SingleLevelInheritence extends SingleLevelInheritence1{ // Child Class
	void Gk() {
		System.out.println("I am Gk Non Static Method");
	}

	public static void main(String[] args) {
		Amt43_SingleLevelInheritence obj = new Amt43_SingleLevelInheritence();
		obj.Gk();
		obj.Selenium();
		obj.Java();

	}

}
