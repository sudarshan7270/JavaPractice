package com.com.example.Java;

class Humen {
	public void Hello3() {
		System.out.println("in Humne");
	}
}

class Man extends Humen {
	public void Hello2() {
		System.out.println("in Man");
	}

}

class Boy extends Man {
	public void Hello1() {
		System.out.println("in boy");
	}

}

public class JavaProjClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Boy obj = new Boy();
		obj.Hello3();
	
	}

}
