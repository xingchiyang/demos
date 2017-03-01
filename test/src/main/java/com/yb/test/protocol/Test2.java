package com.yb.test.protocol;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/03/01 0001.
 * URL类
 */
public class Test2 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.imooc.com");
			URL url1 = new URL(url, "/index.html?username=tom#test"); // #锚点信息
			System.out.println(url1.getProtocol());
			System.out.println(url1.getHost());
			System.out.println(url1.getPort());
			System.out.println(url1.getDefaultPort());
		} catch (MalformedURLException e) {
		}
	}
}
