package com.yb.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {
	private static final Logger logger = LoggerFactory.getLogger(Test1.class);

	public static void main(String[] args) {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}
