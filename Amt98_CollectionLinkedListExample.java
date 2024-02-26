package Batch37Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class Amt98_CollectionLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Writting a Program on linkedList");
		LinkedList ll1 = new LinkedList();
		ll1.add("Manish");
		ll1.add("Ramu");
		ll1.add("Sagar");
		ll1.add("Chaitra");
		ll1.add("Yaalvizhi");
		ll1.add("Yaalvizhi");
		ll1.add("Yaalvizhi");
		/*
		ll1.add('C');
		ll1.add(true);
		ll1.add(1000);
		ll1.add(null);
		ll1.add(null);
		*/
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
		Collections.sort(ll1);
		System.out.println(ll1);
		System.out.println("Accepts duplicates");
		System.out.println("Accepts null");
		System.out.println("Accepts Sorting");
		System.out.println("Accepts Hetrogenious values");
		System.out.println("Accepts boolean");
		System.out.println("Accepts integer values");
		System.out.println("Accepts single characters");

	}

}
