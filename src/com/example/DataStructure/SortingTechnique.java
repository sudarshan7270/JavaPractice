package com.example.DataStructure;

import java.util.Iterator;

//	Bubble sort-> O(n^2) sort staring from 1st chech 1st 2 and swap acceodingly continuously

public class SortingTechnique {

	public static void main(String[] args) {
		int []num= {6,4,3,5,6,7,82,2};
		int temp=0;
		System.out.print("No Before sort : ");

		for (int i:num) {
			System.out.print(" "+i);
		}
		
//		Bubble Sort
//		
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num.length-i-1; j++) {
//				if (num[j]>num[j+1]) {
//					temp=num[j];
//					num[j]=num[j+1];
//					num[j+1]=temp;
//					
//				}
//				
//			}
//						
//			
//		}
		int minIndex=0;
		
//		Selection Sort
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[minIndex]>num[j]) {
					minIndex=j;
					
				}
				temp=num[minIndex];
				num[minIndex]=num[i];
				num[i]=temp;
				
			}
			
		}
		
		
		
//		for (int i = 0; i < num.length-1; i++) {
//			for (int j = i+1; j < num.length; j++) {
//				
//			}
//			
//		}
		
		
		
		System.out.println();
		System.out.print("No After sort  : ");
		for (int i : num) {
			System.out.print(" "+i);

			
		}

	}

}
