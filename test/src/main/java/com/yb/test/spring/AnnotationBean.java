package com.yb.test.spring;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy(false)
public class AnnotationBean {
	@PostConstruct
	public void start() {
		System.out.println("annotation create");
	}

}
