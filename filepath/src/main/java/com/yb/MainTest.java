package com.yb;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;

public class MainTest {
	public static void main(String[] args) throws Exception {
		URI uri = null;

		// 相对于类加载器路径（可以理解成是classpath路径）
		uri = Thread.currentThread().getContextClassLoader().getResource("a2.txt").toURI();
		System.out.println("1、" + uri);

		// 相对于类加载器路径（可以理解成是classpath路径）
		uri = MainTest.class.getClassLoader().getResource("a2.txt").toURI();
		System.out.println("2、" + uri);

		// 相对于当前class的路径
		uri = MainTest.class.getResource("a1.txt").toURI();
		System.out.println("3、" + uri);

		// 相对于类加载器路径，可以加载依赖的多个jar（可以理解成是classpath路径）
		Enumeration<URL> url = Thread.currentThread().getContextClassLoader().getResources("a2.txt");
		while (url.hasMoreElements()) {
			System.out.println("4、" + url.nextElement());
		}

		// 相对于user.dir路径，web应用中一般不用
		System.out.println("5、" + new File("a2.txt").getAbsolutePath());
	}

}
