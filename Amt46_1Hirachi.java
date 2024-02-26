package Batch37Assignments;

class Class_A {
	void A_Display() {
		System.out.println("This is Class A");
	}
}

class Class_B extends Class_A {
	void B_Display() {
		System.out.println("This is Class B");
	}
}

/*
class Class_C extends Class_A {
	void C_Display() {
		System.out.println("This is Class C");
	}
}


class Class_D extends Class_A {
	void D_Display() {
		System.out.println("This is Class D");
	}
}*/

public class Amt46_1Hirachi extends Class_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Method");

		Class_B Objb = new Class_B();
		Objb.A_Display();
		Objb.B_Display();

		/*Class_C Objc = new Class_C();
		Objc.C_Display();

		Class_D Objd = new Class_D();
		Objd.D_Display();
		*/

	}

}
