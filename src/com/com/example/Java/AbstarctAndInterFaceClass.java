package com.com.example.Java;


//method overloading -> compile time polymorphism -> same method name but different parameter
//method overriding -> Runtime Polymorphism -> same method name same parameter but different behaviuor
//				
//				class Car{
//					public void Hellob(int a) {
//						System.out.println("in hello");
//						
//					}
//					
//				}
//				class Bike extends Car{
//					public  void Hello(int a) {
//						System.out.println("in bike");
//						
//					}
//				}

//  abstarct keyword suppose you want to declare just method without implementation 
//   then you have to use abstract keyword (abstarct idea i dont know how to do)

//   abstract class object can't created
//   abstract referece can used
//   abstract class have other method also


//		abstract class Car{
//			public abstract void  drive();
//		}
//		class Bike extends Car{            // concreate class 
//			public void drive() {
//				System.out.println("driving");
//				
//			}
//		}

// referece of parent possible and objcet of subclass

// interface
//interface is not class and method inside interface are by defaut public abstract
// all variaBLe in interface are final and static by default
//variable can be used directly with interface_name.variablename in main
// Function interface has only one method used by as anotation to interface @functionalInterface
// lamba expression only works with function interfaces with annymous inner class  in main get obj directly
// types of interfaces -> Normal, Functional/SAM, Marker
// Normal -> More than 2 method
// Functional Interface -> Only one method
// marker interface -> blank method(no method)


//		interface  Drive{
//			 void bike();
//		}
//		
//		class Bike implements Drive{
//			public void bike() {
//				System.out.println("biking");
//				
//			}
//		}
//		class Car implements Drive{
//			public void bike() {
//				System.out.println("caring");
//				
//			}
//		}
//		class Learn{
//			public void bike(Drive drv) {
//				
//				drv.bike();
//			}
//		}

//			interface A{
//				void show();
//				void config();
//				
//			}
//			interface C{
//				void showing();
//				
//			}
//			class B implements A,C{
//			
//				@Override
//				public void show() {
//					System.out.println("showing");
//					
//				}
//			
//				@Override
//				public void config() {
//					System.out.println("confing");
//			
//				}
//			
//				@Override
//				public void showing() {
//					System.out.println("shownc c");
//			
//				}
//				
//			}

@FunctionalInterface
interface A{
	int show(int i,int j);
}
interface NewFile{
	void getData();
}


public class AbstarctAndInterFaceClass {

	
	public static void main(String[] args) {
		
		A objA = (i,j)-> i+j;
			
		
	
		int res=objA.show(10, 90);
		System.out.println(res);
		

	}

}
