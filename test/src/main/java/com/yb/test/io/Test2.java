package com.yb.test.io;

import java.io.*;
import java.util.Properties;

/**
 * 标准输出流
 * Created by Administrator on 2017/05/18 0018.
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		Properties properties = System.getProperties();
		properties.list(System.out);

		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String t = "";
		while ((t = br.readLine()) != null) {
			System.out.println(t);
			break;
		}
	}
}
