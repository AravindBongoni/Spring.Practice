package com.Autowire;

public class B {
	A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B() {
		System.out.println("B Construted created");
		
	}
	public B(A ji) {
		System.out.println("Param-constructor");
	}
	public void m2() {
		System.out.println("m2 method");
		
		
	}
	public void m3() {
		// TODO Auto-generated method stub
		m2();
		a.m1();
	}
	

}
