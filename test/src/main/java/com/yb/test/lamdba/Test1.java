package com.yb.test.lamdba;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<String> l = new ArrayList();
		l.add("str1");
		l.add("str2");
		l.forEach(str -> System.out.println(str));
	}
}
