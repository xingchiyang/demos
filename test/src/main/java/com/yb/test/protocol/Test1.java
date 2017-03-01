package com.yb.test.protocol;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/03/01 0001.
 * InetAddress类
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
		} catch (UnknownHostException e) {
		}

	}
}
