package com.com.example.JavaInterviewQue;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Bike{
	void drive() {
		System.out.println("Driving");
	}
}
class Car extends Bike{

	@Override
	void drive() {
		System.out.println("carring");
	}
	
}


public class BasicInterViewQue {
	
	
	
	

	public static void main(String[] args) {
//		String str ="Hello";
//		int len=str.length();
//		String rev="";
//		for (int i = len-1; i >= 0; i--) {
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println(rev);
//		
//		String name="Sudarshan   Sanjay Bhosale";
//		String[] strArray=name.split("\\W+");
//		for (String string : strArray) {
//			System.out.print(" "+string);
//			
//		}
//		System.out.println();
//		for (int i = strArray.length-1; i >=0; i--) {
//			System.out.print(strArray[i]+" ");
//			
//		}
//		
//		int a=10;
//		int b=20;
////		using third variable
////		int temp=a;
////		a=b;
////		b=temp;
////		System.out.println(a+" "+b);
////		without using third variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+" "+b);
//		
//		int fact=10;
//		int sum=1;
//		for (int i = 1; i <=fact; i++) {
//			sum=sum*i;
//			
//		}
//		System.out.println(sum);
//		
//		int num=20;
//		int count=0;
//		for (int i = 1; i <=num; i++) {
//			if (num%i==0) {
//				count++;
//				
//			}
//			
//		}
//		if (count==2) {
//			System.out.println("Prime");
//			
//		}else {
//			System.out.println("Not Prime");
//
//		}

//		Bike vv= new Bike();
//		Car c=new Car();
//		vv.drive();
//		c.drive();
		int temp=0;
		int minIndex=0;
		
		int []arr= {10,252,363,7,8};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i]>arr[j]) {
//					temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//					
//			
//					
//				}
//				
//				
//			}
//			
//		}
		for (int i = 0; i < arr.length-1; i++) {
			minIndex=i;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[minIndex]>arr[j]) {
					minIndex=j;
					
				}
				
				
		}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
	}
		

		for (int i : arr) {
			System.out.println(i);
		}
		int left=0;
		int right=arr.length-1;
		int find=10;
		int res=-1;

		
		while (left<=right) {
			int mid=(left+right)/2;
			if (arr[mid]==find) {
				res=mid;
				break;
				
			} else if(arr[mid]<find){
				 left=mid+1;
				
			}else {
				right=mid-1;
			}


			
			
		}
		System.out.println("FOund at"+res);

		
		
		
		

	}

}
