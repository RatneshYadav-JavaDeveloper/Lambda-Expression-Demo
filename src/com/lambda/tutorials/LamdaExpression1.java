package com.lambda.tutorials;

//defined functional interface : an interface have only one abstract method is known as functional interface
//implicitly used @FunctionalInterface annotation
interface lambdaInterface{
	public abstract void m1();
}

interface lambdaInterface2{
	public abstract void square(int a);
}

//here i add @FunctionalInterface : EXPLICITLY  TO TELL JVM THIS IS AN FUNCTIONAL INTERFACE
@FunctionalInterface
interface lambdaInterface3{
	//here i dont add public and abstract : OLD RULE -> [if you defined any method inside interface 
	//it automatically add public and abstract  ]
	void m1(int a , int b);
}

interface lambdaInterface4{
	int m1(int a,int b);
}

//here i am using one abstract method , and one default and static method , 
//if you not add a modifier by default it is an public
//from 1.8 version now you can add static and default method
interface lambdaInterface5{
	void m1(int a,int b,int c,int d);
	
	default void m2() {
		System.out.println("I AM FROM DEFAULT METHOD");
	}
	
	static void m3() {
		System.out.println("I AM FROM STATIC METHOD");
	}
}


public class LamdaExpression1  {

	public static void main(String[] args) {
		
		//lambdaInterface
		lambdaInterface li = () -> System.out.println("Hello");
		li.m1();
		
		//lambdaInterface2
		lambdaInterface2 li2 = n -> System.out.println(" Squrae of 5 is : "+n*n);
		li2.square(5);
		
		//lambdaInterface3
		lambdaInterface3 li3 = (a,b) -> System.out.println("The Sum Of "+a+" and "+b+" is "+(a+b));
		li3.m1(5, 6);
		
		//lambdaInterface4
		lambdaInterface4 li4 = (a,b) -> {return a*b;};
		 System.out.println("The Multiplication Of 5 and 6 is "+(li4.m1(5, 6)));
		 
		 //lambdaInterface5
		 lambdaInterface5 li5 = (a,b,c,d) -> System.out.println("The Sum of 5 , 6 , 7 and 8 is : "+(a+b+c+d));
		 li5.m1(5, 6, 7, 8);
		 
		 //calling default method here
		 li5.m2();
		 
		 //calling static method by interface name 
		 lambdaInterface5.m3();
		 
		
		
	}
}
