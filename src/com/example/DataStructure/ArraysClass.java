package com.example.DataStructure;

import java.util.Arrays;
import java.util.Iterator;

// 		Linear Search-> o(n) 
//		Binary Search-> o(log n) require sorted array

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Linear Search
		int[] arr = { 5, 7, 9, 12, 17, 7, 6, 18, 99 };
		Arrays.sort(arr);
		int find = 6;
		
		int res = funBinarySrchRecursive(arr, find, 0, arr.length);
//		int res = funBinarySrch(arr, find);

		if (res != -1)
			System.out.println("Element found at : " + res);
		else
			System.out.println("Element not found");

	

	
		
	}

//	Linear Search

//	public static   int funLinearSrch(int[] arr, int find) {
//		for(int i=0;i<arr.length;i++) {
//			if (arr[i]==find) {
//				return i;
//				
//			}
//		}
//		return -1;
//	}
	
	
//	Binary Search

//	public static   int funBinarySrch(int[] arr, int find) {
//		int left=0;
//		int right=arr.length-1;
//		while(left <=right) {
//			int mid=(left+right)/2;
//			if(arr[mid]==find) {
//				return mid;
//			}else if (arr[mid]<find) {
//				left=mid+1;
//				
//			}else {
//				right =mid-1;
//			}
//		}
//		return -1;
//	}

//	 Recursive binary function
	
	public static int funBinarySrchRecursive(int[] arr, int find, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == find) {
				return mid;
			} else if (arr[mid] < find) {
				return funBinarySrchRecursive(arr, find, mid + 1, right);
			} else {
				return funBinarySrchRecursive(arr, find, left, mid - 1);
			}
		}
		return -1;
	}


	
}
