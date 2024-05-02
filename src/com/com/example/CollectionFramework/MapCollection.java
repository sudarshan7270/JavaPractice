package com.com.example.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.ToIntBiFunction;


public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mapdata=new HashMap<>();
		mapdata.put(10,	 "Sud");
		mapdata.put(20,	 "Sud");
		mapdata.put(30,	 "Sud");
		mapdata.put(40,	 "Sud");
		mapdata.put(40,	 "Sudarshan");
		if (mapdata.containsKey(90)) {
			System.out.println("hello");
		}
//		for iteration over map
		for (Map.Entry<Integer	, String> entry : mapdata.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			if (entry.getValue().equals("Sud")) {
				System.out.println(entry.getKey());
				
			}
		}
//		for iterarte over Key and ValueExp partuculary use below;
//		for key
		for(Integer i:mapdata.keySet()) {
			System.out.println(i);
		}
//		for values
		for(String i:mapdata.values()) {
			System.out.println(i);
		}
		
		System.out.println(mapdata.containsKey(10));
		System.out.println(mapdata.containsValue("Sud"));
		
		mapdata.clear(); // to clear map
		System.out.println(mapdata);
		
		// TREESET -> Sort based on Key
//		Map<String, Integer> orderStr=new TreeMap<>();
//		orderStr.add("a",10);
//		
		Map<String, Integer> oredrMap=new TreeMap<>();
		oredrMap.put("aa",10);
		oredrMap.put("ab",10);
		oredrMap.put("aaa",10);
		oredrMap.remove("aa");   // to remove with key
		System.out.println(oredrMap);

		
				
		
	

//		System.out.println(mapdata);

		

	}

}
