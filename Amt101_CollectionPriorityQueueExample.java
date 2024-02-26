package Batch37Assignments;

import java.util.PriorityQueue;
import java.util.Vector;
import java.util.Collections;

public class Amt101_CollectionPriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writting a Program on PriorityQueue");
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add("Manish");
		pq1.add("Ramu");
		pq1.add("Sagar");
		pq1.add("Chaitra");
		pq1.add("Yaalvizhi");
		pq1.add("Yaalvizhi");
		pq1.add("Yaalvizhi");
		
		//pq1.add('C');
		//pq1.add(true);
		//pq1.add(1000);
		//pq1.add(null);
		//pq1.add(null);
		
		
		/*
		pq1.add("Manish");
		pq1.add("Ramu");
		pq1.add("Sagar");
		pq1.add("Chaitra");
		pq1.add("Yaalvizhi");
		pq1.add("Yaalvizhi");
		pq1.add("Yaalvizhi");
		*/
	
		
		//Collections.sort(pq1);
		System.out.println(pq1);
		System.out.println("Accepts indexing");
		System.out.println("Accepts duplicates");
		System.out.println("Not Accepts null");
		System.out.println("Not Accepts Sorting");
		System.out.println("Not Accepts Hetrogenious values");
		System.out.println("Not Accepts boolean");
		System.out.println("Not Accepts integer values");
		System.out.println("Not Accepts single characters");
		System.out.println("Accepts Dynamic Values");

	}

}
