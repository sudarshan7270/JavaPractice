package com.com.example.CollectionFramework;

import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;
import java.util.concurrent.atomic.AtomicBoolean;



public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr= {10,20,40,50,50,8,7,5};
//		int index=Arrays.binarySearch(arr, 40);
//		System.out.println(index);
//		Arrays.sort(arr);
//		Arrays.fill(arr, 10);  // to fill elemenrt at every place
//		for(int i:arr) {
//			System.out.print(" "+i);
//		}
		
//		Collection Class
		
		List<Integer> listClass=new ArrayList<>();
		listClass.add(10);
		listClass.add(1);
		listClass.add(7);
		listClass.add(80);
		Collections.sort(listClass);
		System.out.println(listClass);
		
//		to get Min & Max   from list
		System.out.println(Collections.max(listClass)+" "+Collections.min(listClass));
		
//		to get Max element  at first and min element at last(reverse Of sort) use below
		Collections.sort(listClass,Comparator.reverseOrder());
		System.out.println(listClass);
		List<StudentData> stu=new ArrayList<>();
		
		stu.add(new StudentData(10, "ANuj"));
		stu.add(new StudentData(11, "Anuja"));
		stu.add(new StudentData(1, "Zex"));
		stu.add(new StudentData(18, "Su"));
		
		System.out.println(stu);
		
//		or want sort on roll jsut use Collections.sort(stu) with compare to in Student class as below 
//		by implementing  StudentData implements Comparable<StudentData> ad 
//		add umimpleted method and modified as 
//		@Override
//		public int compareTo(StudentData that) {
//			return this.rollNo-that.rollNo;
//		} 
//		sorting based on name Use below

		
		Collections.sort(stu, new Comparator<StudentData>() {

			@Override
			public int compare(StudentData o1, StudentData o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		});
		System.out.println(stu);
		






		
		

		
		
		
		
	}

}
