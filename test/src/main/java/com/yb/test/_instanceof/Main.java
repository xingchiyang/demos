package com.yb.test._instanceof;

/**
 * 测试当类继承或者实现多个类、接口的时候 instanceOf是否都为true
 * 
 * @author yangb Create By 2016年12月14日 下午2:49:59
 */
public class Main extends Father implements Interface1, Interface2 {
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m instanceof Main); // true
		System.out.println(m instanceof Interface1); // true
		System.out.println(m instanceof Interface2); // true
		System.out.println(m instanceof Father); // true
		System.out.println(m instanceof Child); // false
		Child c = new Child();
		System.out.println(c instanceof Main);// true
		System.out.println(c instanceof Father); // true
		System.out.println(c instanceof Interface1); // true
		Interface1 i = new Child();
		System.out.println(i instanceof Interface1);// true
		System.out.println(i instanceof Child);// true
		System.out.println(i instanceof Interface3);// false
	}
}
