package com.com.example.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

//		Queue implemented by ArrayList, LinkedList, PriorotyQueue
//		offer to add element, poll to remove element , peek give element at top

//      add vs offer , element vs peek , remove vs poll -> 1st throws exception if not successful
public class QueueLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(5);
		System.out.println("Queue: "+queue);
		
		System.out.println("Remove first element"+queue.poll());
		System.out.println("Queue: "+queue);
		System.out.println("Peek :"+ queue.peek());
		queue.poll();
		System.out.println(queue);

		
	}
		

}
