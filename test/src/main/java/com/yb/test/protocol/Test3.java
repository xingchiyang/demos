package com.yb.test.protocol;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Administrator on 2017/03/01 0001.
 */
public class Test3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.baidu.com");
			InputStream inputStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(inputStream, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();
			while (data != null){
				System.out.println(data);
				data = br.readLine();
			}
			br.close();
			isr.close();
			inputStream.close();
		} catch (Exception e) {
		}
	}
}
