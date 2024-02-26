package Batch37Assignments;

import java.util.Scanner;

public class Amt41_ScannerClasswithSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the valut between 1 to 4");
		int a =s1.nextInt();
		switch(a) {
		case 1:
			System.out.println("Addition");
			break;
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multiplication");
			break;
		case 4:
			System.out.println("Divison");
			break;
		default :
			System.out.println("Please Enter Valid input");
		}

	}

}
