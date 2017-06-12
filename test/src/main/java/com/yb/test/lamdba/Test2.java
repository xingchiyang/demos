package com.yb.test.lamdba;

public class Test2 {
	public static void main(String[] args) {
		new Test3((String str) -> {
			System.out.println(str);
			System.out.println("hello2");
		}).test("hello");
	}
}
