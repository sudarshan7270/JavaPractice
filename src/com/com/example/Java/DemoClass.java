package com.com.example.Java;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//to get ASCII value use System.in.read(); y0u have initialize/declare to use this statement also need to print stmt
//ascii value start from 48 mens 0 has 48, 1 has 49 continues

class Ab implements NewFile{

	@Override
	public void getData() {
		
		System.out.println("Hello getData");
	}
	
}

public class DemoClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter array size");
//		int arrSize=scanner.nextInt();
//		int []arr=new int[arrSize];
//		System.out.println("Enter array  element ");
//
//		for(int i=0;i<arr.length;i++ ) {
//			arr[i]=scanner.nextInt();
//		}
//		System.out.println("Entered array  is ");
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
		
//		}
		
		Ab objj=new Ab();
		objj.getData();
		System.out.println("Enter num");
		int num=System.in.read();
		System.out.println(num);
	
		

	}

}
