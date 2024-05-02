package com.com.example.Java;

import java.util.Iterator;

public class PractceQueInteview {

	public static void main(String[] args) {
		int []nums= {10,86,9,88,5};
//		int num=101;
//		int res=0;
//		while (num!=0) {
//			int rem=num%10;
//			 res=res*10+rem;
//			num=num/10;
//			
//			
//		}
//		System.out.println(res);
		
//		String string="Sudarshan   Bhosale";
//		String []strArray=string.split("\\W+");
//		for (String string2 : strArray) {
//			System.out.print(string2);
//			
//		}	
//		System.out.println();
//
//		
//		for (int i = strArray.length-1; i >= 0; i--) {
//			System.out.print(" "+strArray[i]);
//			
//		}
		int temp=0;
		int minIndex=0;
		
		for (int i = 0; i < nums.length-1; i++) {
			minIndex=i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j]<nums[minIndex]) {
					minIndex=j;
					
				}
				temp=nums[i];
				nums[i]=nums[minIndex];
				nums[minIndex]=temp;
				
				
				
			}
			
		}
		for (int i : nums) {
			System.out.print(i+" ");
			
		}
		int find=86;
		int left=0;
		int right=nums.length-1;
		int res=funBinarySearchRecursive(nums,find,left,right);
		System.out.println("Found at index :"+ res);
		
		String string="Sudarshan";
		String rev=funStringBuilderRevwer(string);
		System.out.println(rev);
		
		
		

	}

	private static String funStringBuilderRevwer(String string) {
		StringBuilder strBuild=new StringBuilder(string);
		strBuild.reverse();
		return strBuild.toString();
	}

	private static int funBinarySearchRecursive(int[] nums, int find, int left, int right) {
		while (left<=right) {
			int mid=(left+right)/2;
			if (nums[mid]==find) {
				return mid;
				
			}
			if (nums[mid]<find) {
				return funBinarySearchRecursive(nums, find, mid+1, right);
				
			}else {
				return funBinarySearchRecursive(nums, find, left, mid-1);
			}
			
			
		}
		return -1;
		
	}
	
	
	
	

}
