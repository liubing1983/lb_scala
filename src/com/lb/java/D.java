package com.lb.java;

public class D extends C{
	
	
	// private void abc(){}
	//public void abc() throws Exception{}
	
	
	
	public static void main(String[] args){
		D d = new D();
		d.abc(1);
	}

	
	public int abc(int q){
		super.abc();
		return 1;
	}

}
