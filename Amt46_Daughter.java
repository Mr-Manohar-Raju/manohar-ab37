package Batch37Assignments;

class p1
{
	static void sum() {
		System.out.println("sum");
	}
}

class Parent {
	static void MethodA() {
		System.out.println("Method A");
	}
}

class Son extends Parent {
	static void MethodB()
	{
		System.out.println("Method B");
	}
}

public class Amt46_Daughter extends Parent {

	static void MethodC() {
		System.out.println("Method C");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		Parent.MethodA();
		Son.MethodB();
		Amt46_Daughter.MethodC();
		p1.sum();
	}
}


