package com.com.example.CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(10);
		pq.offer(8);
		pq.offer(7);
		pq.offer(9);
		System.out.println(pq);  // minheap -> give min elemt at 0th index and after as it is 
//								   maxheap -> giev max at first
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());

	}

}
