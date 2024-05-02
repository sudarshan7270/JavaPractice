package com.com.example.CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		 
		adq.offer(10);
		adq.offerFirst(20);
		adq.offerLast(1);
		adq.offer(9);
		System.out.println(adq);
		System.out.println(adq.peek()); //give top element
		adq.poll();
		adq.peekFirst();// remove first element both poll and pollFirst works same
		System.out.println(adq);
		adq.pollLast();
		System.out.println(adq);
		

	}

}
