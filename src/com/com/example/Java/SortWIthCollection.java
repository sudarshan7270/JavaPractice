package com.com.example.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student{
	int age;
	String Name;
	@Override
	public String toString() {
		return "Student [age=" + age + ", Name=" + Name + "]";
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		Name = name;
	}
}
//class Bike{
//	int model;
//	String nameString;
//	public Bike(int model, String nameString) {
//		super();
//		this.model = model;
//		this.nameString = nameString;
//	}
//	@Override
//	public String toString() {
//		return "Bike [model=" + model + ", nameString=" + nameString + "]";
//	}
//	
//}

public class SortWIthCollection {

	public static void main(String[] args) {
		
		Comparator<Student> comp=new Comparator<Student>() {
			
			@Override
			public int compare(Student i, Student j) {
				if (i.age>j.age) {
					return 1;
					
				}else {
					return -1;

				}
			}
		};
//		
		
//		List<Integer> numsIntegers=new ArrayList<>();
//		numsIntegers.add(12);
//		numsIntegers.add(87);
//		numsIntegers.add(83);
//		numsIntegers.add(96);
//		Collections.sort(numsIntegers);
//		System.out.println(numsIntegers);
		
		List<Student> stu= new ArrayList<>();
		stu.add(new Student(26, "Sudarshan"));
		stu.add(new Student(21, "Ganesh"));
		stu.add(new Student(24, "Tejas"));
		stu.add(new Student(12, "Tejas"));
		stu.add(new Student(19, "Tejas"));

		Collections.sort(stu,comp);
		System.out.println("Hello"+stu);
		
		for(Student s:stu) {
			System.out.println(s);
		}
//		List<Bike> bikes= new ArrayList<>();
//		bikes.add(new Bike(1, "hero"));
//		bikes.add(new Bike(2, "Honda"));
//		System.out.println(bikes);
//		
//		for(Bike b: bikes) {
//			System.out.println(b);
//		}

		
		


		
		
		

		

	}

}
