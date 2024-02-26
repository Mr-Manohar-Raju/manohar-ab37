package Batch37Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Amt99_ArrayListExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writting a Program on ArrayList");
		ArrayList a1 = new ArrayList();
		a1.add("Manish");
		a1.add("Ramu");
		a1.add("Sagar");
		a1.add("Chaitra");
		a1.add("Yaalvizhi");
		a1.add("Yaalvizhi");
		a1.add("Yaalvizhi");
		a1.add('C');
		a1.add(true);
		a1.add(1000);
		a1.add(null);
		a1.add(null);
		/*Dynamic value checking 
		a1.add("Manish");
		a1.add("Ramu");
		a1.add("Sagar");
		a1.add("Chaitra");
		a1.add("Yaalvizhi");
		a1.add("Yaalvizhi");
		a1.add("Yaalvizhi");
		a1.add('C');
		a1.add(true);
		a1.add(1000);
		a1.add(null);
		a1.add(null); // undefined values
		*/
		//Collections.sort(a1);
		System.out.println(a1);
		System.out.println("Accepts duplicates");
		System.out.println("Accepts null");
		System.out.println("Accepts Sorting");
		System.out.println("Accepts Hetrogenious values");
		System.out.println("Accepts boolean");
		System.out.println("Accepts integer values");
		System.out.println("Accepts single characters");
		//accept index, Hetrogenious(stores diff datatype values), int, 
		//boolean, duplicate, null, single character, string, Dynamaic(stores more values)

	}

}
