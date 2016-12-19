package com.yb.test.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试info中动态参数的格式
 * {}
 * @author yangb
 * Create By 2016年12月19日 下午1:48:48
 */
public class DyncParam {
	private static Logger logger = LoggerFactory.getLogger(DyncParam.class);

	public static void main(String[] args) {
		logger.info("hello, 1:{},2:{},3:{}", "1", 2);
	}
}
