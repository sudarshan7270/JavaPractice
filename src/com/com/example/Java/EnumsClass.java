package com.com.example.Java;

import java.util.Iterator;

//			enum Status{
//				SUCCESS,PENDING, FAILED;
//			}

// new exaple 

enum Laptop {
	MAC(1),MOB(2),DESK(3),LAP(4);
	 

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private Laptop(int price) {
		this.price = price;
	}
}

public class EnumsClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//      Status s= Status.SUCCESS;
//		Status[] ss=Status.values();
//		
//		for (Status stsStatus : ss)
//			System.out.println(stsStatus);
//
//	}
		
//		Status status= Status.SUCCESS;
//		if (status==Status.SUCCESS) {
//			System.out.println("RESP_CODE"+" "+"="+" "+"300");
//			
//		}
		
//		Status sts =Status.FAILED;
//		switch (sts) {
//		case SUCCESS: {
//			System.out.println("RESP_CODE"+" "+"="+" "+"300");
//			break;
//			
//		}
//		case PENDING: {
//			System.out.println("RESP_CODE"+" "+"="+" "+"301");
//			break;
//			
//		}
//		case FAILED: {
//			System.out.println("RESP_CODE"+" "+"="+" "+"350");
//			break;
//			
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + sts);
//		}
//		
//		Laptop lap=Laptop.MAC;
//		System.out.println(lap.getPrice());
		 for(Laptop lap: Laptop.values()) {
			 System.out.println(lap+" :"+lap.getPrice());
		 }
	}

}
