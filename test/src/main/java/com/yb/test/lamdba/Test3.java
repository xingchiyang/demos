package com.yb.test.lamdba;

public class Test3 {
	private Interface1 i;
	public Test3(Interface1 i){
		this.i = i;
	}
	public void test(String str){
		i.test1(str);
	}
}
