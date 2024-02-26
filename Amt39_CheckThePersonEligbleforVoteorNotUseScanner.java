package Batch37Assignments;

import java.util.Scanner;

public class Amt39_CheckThePersonEligbleforVoteorNotUseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter age of person to identify young or adult");
		int age =s1.nextInt();
		if(age>=18) {
			System.out.println("I an adult");
		}
		else
		{
			System.out.println("I am young");
		}

	}

}
