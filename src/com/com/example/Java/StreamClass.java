package com.com.example.Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		

		List<Integer> str= Arrays.asList(4,5,7,3,2);
		System.out.println(str);
		
		for(int n:str) {
			if (n%2==0) {
				n=n*2;
				sum=sum+n;
			
				
				
			}
			
		}
		System.out.println(sum);
		

	}

}
