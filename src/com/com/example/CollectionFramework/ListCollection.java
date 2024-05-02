package com.com.example.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

//		Interface List-> Class ArralyList,LinkedList

//		ArrayList-> add(), add(for partucular index - enter index ,enter value)
//		addAll(Arraylist name you want append for previous list)
//		get(enter index to get particular index no) - remove(remove index to remove element)
//		to remove particular matching no use list.remove(Integer.valueof(enter element want to remove))
//		to clear list use listname.clear();
//      set -> to set value at particular index with value -> list.set(indexno,value)
//      contains-> true false->list.contains(element) return false
//		list.size()give no of element->list.get(i)

//      

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stuName=new ArrayList<>();
		stuName.add("Sudarshan");
		stuName.add("Sanjay");
		stuName.add("Bhosale");
		stuName.add(0,"Mr"); // (index:,valus:"")
		System.out.println(stuName);
		ArrayList<String> newList=new ArrayList<>();
		newList.add("Karmala");
		stuName.addAll(newList);
		System.out.println(stuName);
		stuName.remove(1);
		System.out.println("operation"+" "+stuName);
		Iterator<String> itrtor=stuName.iterator();
		while(itrtor.hasNext()) {
			System.out.println("Iterator"+itrtor.next());
		}

	}

}
