package com.yb.test.zip;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.ClientProtocolException;
import org.zeroturnaround.zip.ZipEntryCallback;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;

/**
 * Created by Administrator on 2017/05/11 0011.
 */
public class ZipTest {
	public static void main(String[] args) throws ClientProtocolException, IOException {

		InputStream is = new FileInputStream(new File(""));

		ZipUtil.iterate(is, new ZipEntryCallback() {

			public void process(InputStream in, ZipEntry zipEntry) throws IOException {
				System.out.println(zipEntry.getName());
				if (!zipEntry.isDirectory()) {
					List<String> lines = IOUtils.readLines(in);
					for (String str : lines) {
						System.out.println(str);
					}
				}
			}
		});
		is.close();
	}
}
