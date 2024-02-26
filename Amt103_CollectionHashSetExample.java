package Batch37Assignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Amt103_CollectionHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Writting a Program on HashSet");
		HashSet h1 = new HashSet();
		h1.add("Manish");
		h1.add("Ramu");
		h1.add("Sagar");
		h1.add("Chaitra");
		h1.add("Yaalvizhi");
		h1.add("Yaalvizhi");
		h1.add("Yaalvizhi");		
		
		
		h1.add('C');
		h1.add(true);
		h1.add(1000);
		h1.add(null);
		h1.add(null);
		
	
		
		h1.add("Manish");
		h1.add("Ramu");
		h1.add("Sagar");
		h1.add("Chaitra");
		h1.add("Yaalvizhi");
		h1.add("Yaalvizhi");
		h1.add("Yaalvizhi");
		
		h1.add("Manish");
		h1.add("Ramu");
		h1.add("Sagar");
		h1.add("Chaitra");
		h1.add("Yaalvizhi");
		h1.add("Yaalvizhi");
		h1.add("Yaalvizhi");
		
	
		
		//Collections.sort(h1);
		System.out.println(h1);
		System.out.println("Accepts indexing");
		System.out.println("Not Accepts duplicates");
		System.out.println("Not Accepts null");
		System.out.println("Not Accepts Sorting");
		System.out.println("Accepts Hetrogenious values");
		System.out.println("Accepts boolean");
		System.out.println("Accepts integer values");
		System.out.println("Accepts single characters");
		System.out.println("Not Accepts Dynamic Values");


	}

}
