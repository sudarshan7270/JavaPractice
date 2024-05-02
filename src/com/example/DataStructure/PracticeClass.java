package com.example.DataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class PracticeClass {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);

		int[] nums = { 4, 6, 1, 23, 5, 67, 8 };
//		System.out.println("Enter find no: ");
//		int find=sc.nextInt();

//		int res=funLinearSearch(nums,find);
//		Arrays.sort(nums);
//		int res=funBinarySerach(nums,find);
//		int left=0;
//		int right=nums.length-1;
//		int res=funBinarySerachRecursive(nums,find,left,right);

		System.out.println("Array Before Sort");

		for (int i : nums)
			System.out.print(" "+i);
//		funBubbleSort(nums);
//		funSelectionSort(nums);
		funInsertionSort(nums);
		System.out.println();
		System.out.println("Array After Sort");

		for (int i : nums)
			System.out.print(" "+i);


//		if (res!=-1) {
//			System.out.println("Find No at index : "+res);
//
//		}else {
//			System.out.println("No Not Found");
//
//		}
//	

	}

	private static void funInsertionSort(int[] nums) {
//		int[] nums = { 4, 6, 1, 23, 5, 67, 8 };
		int temp=0;

		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1 ; j< nums.length; j++) {
				if (nums[j]<nums[i]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					
					
				}
				
			}
			
		}
		
	}

//	private static void funSelectionSort(int[] nums) {
//		int minIndex=0;
//		int temp=0;
//		for (int i = 0; i < nums.length-1; i++) {
//			minIndex=i;
//			for (int j = i+1; j < nums.length; j++) {
//				if (nums[j]<nums[minIndex]) {
//					minIndex=j;
//				}
//				
//			}
//			temp=nums[i];
//			nums[i]=nums[minIndex];
//			nums[minIndex]=temp;
//			
//		}
//		
//		
//	}

//	private static void funBubbleSort(int[] nums) {
//		int temp=0;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums.length-i-1; j++) {
//				if (nums[j+1]<nums[j]) {
//					temp=nums[j];
//					nums[j]=nums[j+1];
//					nums[j+1]=temp;
//					
//				}
//				
//			}
//			
//		}
//	}

//	private static int funBinarySerachRecursive(int[] nums, int find, int left, int right) {
//		while (left<=right) {
//			int mid=(left+right)/2;
//			if (nums[mid]==find) {
//				return mid;
//			}
//				else if (nums[mid]<find) {
//					return funBinarySerachRecursive(nums, find, mid+1, right);
//					
//				}
//				 else {
//						return funBinarySerachRecursive(nums, find, left, mid-1);
//
//					
//				}
//			}
//			
//		return -1;
//	}

//	private static int funBinarySerach(int[] nums, int find) {
//		int left=0;
//		int right=nums.length-1;
//		while (left<=right) {
//			int mid=(left+right)/2;
//			if (nums[mid]==find) {
//				return mid;
//				
//			} else if (nums[mid]<find) {
//				left=mid+1;
//				
//			}else {
//				right=mid-1;
//			}
//			
//		}
//		return -1;
//	}

//	private static int funLinearSearch(int[] nums, int find) {
//		for (int i = 0; i < nums.length-1; i++) {
//			if(nums[i]==find)
//				return i;
//			
//		}
//		return -1;
//	}
//	

}
