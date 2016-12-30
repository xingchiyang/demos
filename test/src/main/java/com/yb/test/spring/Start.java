package com.yb.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 相关注解原理分析
 * @author yangb
 * Create By 2016年12月30日 上午10:08:41
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring-context.xml");
	}
}
