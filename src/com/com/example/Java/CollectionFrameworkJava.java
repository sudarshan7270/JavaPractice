package com.com.example.Java;

import java.util.Iterator;

public class CollectionFrameworkJava {

	public static void main(String[] args) {
		String str="SUDARSHAN    SANJAY BHOSALE";
	String arr[]=str.split("\\s+");
		for (String st : arr) {
		System.out.println(st);
	}
	int l=arr.length;
		for(int i=l-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
//		int len=str.length();
//		String rev="";
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
		
//		System.out.println(rev);

	}

}
