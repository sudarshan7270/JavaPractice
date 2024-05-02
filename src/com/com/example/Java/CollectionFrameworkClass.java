package com.com.example.Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


//			 define type also in <> before var_name and same after clas use as <> -Generics	
//             Collection <Integer>nums= new ArrayList<Integer>();
//				collection does not support index valus but List support

//           set with Hashset doesnt give repeted value / collection of unique value
//      if with set wnated sort then iser TreeSet class insted of Hashset

//  Map to add its in key and value pair use .put(key,value) method
//to upadte value use below change value onlu with put key are unique

//add new element
//put -> add  element if doesnt exit if exit just update
//Hashtable are synchronizesd



public class CollectionFrameworkClass {

	public static void main(String[] args) {
		
		List <Integer>nums= new ArrayList<Integer>();
		nums.add(6);
		nums.add(3);
		nums.add(2);
		nums.add(99);
		nums.add(6);
//		System.out.println(nums.get(0));
//		System.out.println(nums.indexOf(99));
		System.out.println(nums);
		
		Set<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(1);
		System.out.println(set);
		
		Map<String, Integer> stuData=new HashMap<>();
		stuData.put("Sudarshan", 7);
		stuData.put("ganesh", 6);
		stuData.put("Sudarshan", 10);
		System.out.println(stuData);
//		System.out.println(stuData.get("ganesh"));
		for(String s : stuData.keySet() ) {
			System.out.println(s+":"+stuData.get(s));
		}
		
		Collection data = new ArrayList<>();
		data.add(10);
		data.add(12);
		System.out.println(data);
		
		Set<Integer> noDupli=new TreeSet<>();
		noDupli.add(10);
		noDupli.add(10);
		noDupli.add(1);
		noDupli.add(8);
		System.out.println("Hello"+noDupli);
		
		int [] arr= {10,20,30,40,8,9,5};
		List<Integer> fienalList=new ArrayList<>();
		 for (int i : arr) {
			 fienalList.add(i);
		 }
		 Collections.sort(fienalList);
		 System.out.println(fienalList);
		 
		 Map<Integer, String> mapdataMap=new TreeMap<>();
		 mapdataMap.put(1, "Hello");
		 mapdataMap.put(20, "world");
		 mapdataMap.put(2, "world");
		 mapdataMap.put(0, "world");
		 mapdataMap.put(0, "Sudarshan");
		 mapdataMap.put(20, "Bhosale");

		 


		 System.out.println(mapdataMap);
		 
		 
		 
		
		

		
	
//
//		for(int n: nums) {
//			System.out.println(n);
//
//		}

		

	}

}
