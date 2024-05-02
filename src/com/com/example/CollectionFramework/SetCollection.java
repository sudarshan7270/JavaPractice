package com.com.example.CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();  // HashSet used to avoid dupilcate if LinkedHashSet used elemnt add order by order
		
		set.add(10);
		set.add(10);
		set.add(39);
		set.add(89);
		System.out.println(set);
		set.remove(89);   // to remove
		System.out.println(set);
		System.out.println(set.contains(10)); // to check element present or not t / f
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		
		
		
		Set<Integer> setTreee=new TreeSet<>();
		setTreee.add(10);
		setTreee.add(10);
		setTreee.add(39);
		setTreee.add(89);
		System.out.println(setTreee);
		
		Set<StudentData> stuData=new HashSet<>();
		stuData.add(new StudentData(1, "Sudarshan"));
		stuData.add(new StudentData(2, "Sudarshan"));
		stuData.add(new StudentData(5, "Sudarshan"));
		stuData.add(new StudentData(3, "Sudarshan"));
		stuData.add(new StudentData(4, "Sudarshan"));
		stuData.add(new StudentData(1, "Sudarshan"));
		System.out.print(stuData);


	}

}
