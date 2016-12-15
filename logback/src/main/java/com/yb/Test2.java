package com.yb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test2 {
	private static final Logger logger = LoggerFactory.getLogger(Test2.class);

	public static void main(String[] args) {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}
