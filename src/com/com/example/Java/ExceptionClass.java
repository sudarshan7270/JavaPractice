package com.com.example.Java;

//		error -> compile, runtime,logical

//runtime error are exception we need to handle 

//crete new exception 

//			ducking exception means handle exception  by anothther function but ypu have to use throws exception after () and before {
//				use throws Exception{} like public void show() throws Exception{} nd you hav e handle it whe it callling

		class SudarshanException extends Exception{
			public SudarshanException(String str) {
				super(str);
				
			}
		}

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=0;
		int [] a=new int[6];
		String string=null;
		try {
			j=18/30;
			if(j==0) 
				throw new SudarshanException("from hnadle");
			
//			System.out.println(a[6]);
//			System.out.println(string.length());

		}catch (SudarshanException e) {
			j=18/1;
			System.out.println("this os default output"+e);

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("somethinw wrong in array");
		}
	
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("hello");
		}
		System.out.println(j);

	}

}
