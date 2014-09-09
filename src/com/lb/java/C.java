package com.lb.java;

public class C extends B{
	
	//public void abcc(){}
	
	C c  = new D();  // 多态
	
	
	D d = (D)c;  // 向下转型
	B b = c;  // 向上转型
	
	public void aaa(){
		b.abc();
		}
}