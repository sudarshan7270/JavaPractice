package com.com.example.Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//			to use thread menas want run muiltiple fun at time need to extend Thread class with must run method inside class 
//			 call it with objnam.start()

//		sleep used to stop thraed by passing milisec as argument Thraed.sleep(secin mili)
//		setpriority to use priority of obj -> 1 - least 10 - max  -> obj_Name.setPriority(Thread.MAX_PRIORITY);

//if want to use runnable need to use seperate thread obj with implement ruunable with referec as runnable also want obj to thraed

class D implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
class E implements  Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
}

public class threadsTutClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obA=new D();
		Runnable obB=new E();
//		obA.setPriority(Thread.MAX_PRIORITY);
		Thread t1=new Thread(obA);
		Thread t2 = new Thread(obB);
		t1.start();
		t2.start();
		List< Integer> nums=Arrays.asList(10,20,6,5,8);
		Stream<Integer> s1= nums.stream();
		Stream<Integer> s2=s1.filter(n->n%2==0);
		Stream<Integer> s3=s2.map(n->n*2);
		s3.forEach(n->System.out.println(n));
		
		
				
				

	}

}
