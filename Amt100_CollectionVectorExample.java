package Batch37Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Amt100_CollectionVectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writting a Program on Vector");
		Vector v1 = new Vector();
		v1.add("Manish");
		v1.add("Ramu");
		v1.add("Sagar");
		v1.add("Chaitra");
		v1.add("Yaalvizhi");
		v1.add("Yaalvizhi");
		v1.add("Yaalvizhi");
		v1.add('C');
		v1.add(true);
		v1.add(1000);
		v1.add(null);
		v1.add(null);
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
		//Collections.sort(v1);
		System.out.println(v1);
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
