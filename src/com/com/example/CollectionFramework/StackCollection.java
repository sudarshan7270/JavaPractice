package com.com.example.CollectionFramework;

import java.util.Stack;

//		stack_var.push() to add element
//		stack_var.peek() give top elemnt
//		stack_var.pop()  remove top elemet

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stckEle=new Stack<>();
		stckEle.push("Hello");
		stckEle.push("sud");
		System.out.println("Stack: "+stckEle);
		System.out.println("Peel 1: "+stckEle.peek());
		stckEle.pop();
		System.out.println("Peel 2: "+stckEle.peek());

		

	}

}
