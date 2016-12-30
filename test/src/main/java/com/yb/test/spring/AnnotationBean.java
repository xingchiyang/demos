package com.yb.test.spring;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class AnnotationBean {
	@PostConstruct
	public void start() {
		System.out.println("annotation create");
	}

}
